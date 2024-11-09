package com.ursolgleb.myfirstapp.imccalculator


import androidx.activity.viewModels


import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.ursolgleb.controlimc.R
import com.ursolgleb.controlimc.CurrentViewModel


class ImcCalculatorActivity : AppCompatActivity() {

    private val viewModel: CurrentViewModel by viewModels()

    private lateinit var viewMail: CardView
    private lateinit var viewFamail: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var tvWeight: TextView
    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton
    private lateinit var tvAge: TextView
    private lateinit var btnSubstractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var btnCalculate: Button

    companion object{
        const val IMC_KEY = "IMC_RESOLT"
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents()
        initUI()
        initListeners()

        viewModel.isMaleSelected.observe(this){
            viewMail.setCardBackgroundColor(getGenderColor(it))
        }
        viewModel.isFemaleSelected.observe(this){
            viewFamail.setCardBackgroundColor(getGenderColor(it))
        }

    }

    private fun initComponents() {
        viewMail = findViewById(R.id.viewMail)
        viewFamail = findViewById(R.id.viewFamail)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvAge = findViewById(R.id.tvAge)
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        btnCalculate = findViewById(R.id.btnCalculate)

    }

    private fun initUI() {
        setWeight()
        setAge()
        setHeight()
    }




    @RequiresApi(Build.VERSION_CODES.N)
    private fun initListeners() {
        viewMail.setOnClickListener {
            viewModel.changeGender(true)
        }
        viewFamail.setOnClickListener {
            viewModel.changeGender(false)
        }

        rsHeight.addOnChangeListener { _, value, _ ->
            viewModel.setHeight(value.toInt())
        }

        btnSubtractWeight.setOnClickListener {
            viewModel.substractPeso()
        }
        btnPlusWeight.setOnClickListener {
            viewModel.incrementPeso()
        }

        btnSubstractAge.setOnClickListener {
            viewModel.substractAge()
        }
        btnPlusAge.setOnClickListener {
            viewModel.incrementAge()
        }

        btnCalculate.setOnClickListener {
            navigateToReslt(calculateIMC())
        }

    }

    private fun navigateToReslt(imc: Double) {
        val intent = Intent(this, ResoltIMCActivity::class.java)
        intent.putExtra(IMC_KEY, imc)
        startActivity(intent)

    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun calculateIMC(): Double {
        val currentWeight = (viewModel.currentWeight.value ?:1).toDouble()
        val currentHeight = (viewModel.currentHeight.value ?:1).toDouble()
        var imc = currentWeight / (currentHeight / 100 * currentHeight / 100)
        imc = DecimalFormat("#.##").format(imc).toDouble()
        return imc
    }

    private fun setHeight() {
        viewModel.currentHeight.observe(this){
            tvHeight.text = getString(R.string.height_display, it.toString(), getString(R.string.sm))
        }
    }

    private fun setWeight() {
        viewModel.currentWeight.observe(this){
            tvWeight.text = it.toString()
        }
    }

    private fun setAge() {
        viewModel.currentAge.observe(this){
            tvAge.text  = it.toString()
        }
    }

    private fun getGenderColor(isSelected: Boolean): Int {
        if (isSelected) return ContextCompat.getColor(this, R.color.background_component_selected)
        return ContextCompat.getColor(this, R.color.background_component)
    }


}