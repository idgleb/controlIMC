package com.ursolgleb.controlimc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CurrentViewModel: ViewModel() {

    private val _isMaleSelected = MutableLiveData<Boolean>()
    val isMaleSelected: LiveData<Boolean> get() = _isMaleSelected

    private val _isFemaleSelected = MutableLiveData<Boolean>()
    val isFemaleSelected: LiveData<Boolean> get() = _isFemaleSelected

    private val _currentWeight = MutableLiveData<Int>()
    val currentWeight: LiveData<Int> get() = _currentWeight

    private val _currentAge = MutableLiveData<Int>()
    val currentAge: LiveData<Int> get() = _currentAge

    private val _currentHeight = MutableLiveData<Int>()
    val currentHeight: LiveData<Int> get() = _currentHeight

    init {
        _isMaleSelected.value = true
        _isFemaleSelected.value = false
        _currentWeight.value = 80
        _currentAge.value = 30
        _currentHeight.value = 120
    }

    // Cambiar el género seleccionado
    fun changeGender(isMale: Boolean) {
        _isMaleSelected.value = isMale
        _isFemaleSelected.value = !isMale
    }

    // Incrementar el peso
    fun incrementPeso() {
        _currentWeight.value = (_currentWeight.value ?: 60) + 1
    }

    // Disminuir el peso (con validación para evitar números negativos)
    fun substractPeso() {
        _currentWeight.value = (_currentWeight.value ?: 60).let {
            if (it > 1) it - 1 else 1 // Mínimo valor de peso es 1
        }
    }

    // Disminuir la edad (con validación para evitar números negativos)
    fun substractAge() {
        _currentAge.value = (_currentAge.value ?: 60).let {
            if (it > 0) it - 1 else 0 // Evitar que la edad sea negativa
        }
    }

    // Incrementar la edad
    fun incrementAge() {
        _currentAge.value = (_currentAge.value ?: 60) + 1
    }

    // Establecer la altura
    fun setHeight(value: Int) {
        _currentHeight.value = value
    }
}
