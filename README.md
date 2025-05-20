
# controlIMC 🩺

## 📸 Capturas de pantalla

![control IMC](https://github.com/user-attachments/assets/e9a028d9-7752-40b0-b55c-08d12e195e3c)


**📱 Una aplicación Android para calcular tu Índice de Masa Corporal (IMC) y obtener recomendaciones personalizadas.**

## ✨ Descripción

**controlIMC** es una aplicación Android desarrollada en Kotlin que te ayuda a calcular tu **Índice de Masa Corporal (IMC)** de forma sencilla y visual. Ingresa tu peso, altura, edad y género, y obtén tu IMC junto con consejos de salud según tu categoría (bajo peso, normal, sobrepeso, obesidad). Con un diseño moderno basado en **Material Design** y una arquitectura **MVVM**, esta app es ideal para usuarios que buscan monitorear su salud o desarrolladores que quieren explorar Android Jetpack.

---

## 🚀 Características

- 🧮 **Cálculo de IMC**: Calcula tu IMC con peso (kg), altura (cm) y edad.
- 👥 **Selección de género**: Elige entre masculino o femenino con un toque.
- 📏 **Ajuste interactivo**: Usa un deslizador para la altura y botones para peso y edad.
- 📊 **Resultados claros**: Muestra el IMC, categoría y consejos personalizados (bajo peso, normal, sobrepeso, obesidad grado 1, 2 o 3).
- 🎨 **Diseño moderno**: Interfaz intuitiva con **CardView** y colores dinámicos.
- 🔄 **Recalcular**: Regresa fácilmente a la pantalla principal para nuevos cálculos.

---



| Pantalla Principal | Resultados IMC |
|--------------------|----------------|
| ![Pantalla Principal](https://via.placeholder.com/300x600.png?text=Pantalla+Principal) | ![Resultados](https://via.placeholder.com/300x600.png?text=Resultados+IMC) |

> ℹ️ *Sustituye los placeholders con capturas reales de la app para un mejor impacto visual.*

---

## 🛠️ Requisitos

- 📱 **Sistema operativo**: Android 7.0 (Nougat, API 24) o superior.
- 🧰 **Herramientas**:
    - Android Studio (recomendado: 2023.3.1 o superior).
    - Gradle 8.0 o superior.
    - Kotlin 1.9 o superior.

---

## ⚙️ Instalación

Sigue estos pasos para configurar y ejecutar **controlIMC** en tu entorno local:

1. **Clona el repositorio** 📥:
   ```bash
   git clone https://github.com/idgleb/controlIMC.git
   cd controlIMC
   ```

2. **Abre en Android Studio** 🖥️:
    - Abre Android Studio y selecciona `File > Open`.
    - Navega hasta la carpeta del proyecto clonado y selecciónala.

3. **Sincroniza el proyecto** 🔄:
    - Haz clic en `Sync Project with Gradle Files` para instalar las dependencias.

4. **Ejecuta la aplicación** 🚀:
    - Conecta un dispositivo Android o configura un emulador.
    - Haz clic en `Run > Run 'app'` para compilar e instalar.

---

## 📖 Uso

1. Abre **controlIMC** en tu dispositivo Android 📱.
2. Selecciona tu género (masculino 👨 o femenino 👩) en las tarjetas.
3. Ajusta la altura con el deslizador 📏.
4. Usa los botones `+` y `-` para modificar peso ⚖️ y edad 🎂.
5. Presiona **Calcular** para obtener tu IMC 🧮.
6. Revisa los resultados, que incluyen tu IMC, categoría y consejos de salud 📊.
7. Usa el botón **Recalcular** para volver y probar nuevos valores 🔄.

---

## 🧑‍💻 Tecnologías utilizadas

- **Lenguaje**: Kotlin 🟪
- **Arquitectura**: MVVM con Android Jetpack 🛠️
- **Componentes principales**:
    - `ViewModel` y `LiveData` para datos reactivos 📡.
    - `CardView` para selección de género 🎴.
    - `RangeSlider` y `FloatingActionButton` para una interfaz fluida 🖱️.
    - **Material Design** para un diseño moderno 🌟.
- **Dependencias**:
    - AndroidX Core
    - AndroidX AppCompat
    - Material Components
    - AndroidX Activity (para ViewModels)

---

## 📂 Estructura del proyecto

```
controlIMC/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/ursolgleb/controlimc/
│   │   │   │   └── CurrentViewModel.kt
│   │   │   ├── java/com/ursolgleb/myfirstapp/imccalculator/
│   │   │   │   ├── ImcCalculatorActivity.kt
│   │   │   │   └── ResoltIMCActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_imc_calculator.xml
│   │   │   │   │   └── activity_resolt_imcactivity.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── strings.xml
```

---

## 🤝 Contribuir

¡Tu colaboración es bienvenida! 🌟 Para contribuir:

1. Haz un **fork** del repositorio 🍴.
2. Crea una rama para tu cambio (`git checkout -b feature/nueva-funcionalidad`) 🌿.
3. Realiza tus cambios y haz commit (`git commit -m "Añadir nueva funcionalidad"`) ✅.
4. Envía los cambios a tu fork (`git push origin feature/nueva-funcionalidad`) 🚀.
5. Abre un **Pull Request** en GitHub 📬.

Consulta las [Guías de Contribución](CONTRIBUTING.md) para más detalles (puedes crear este archivo si deseas).

---

## 📜 Licencia

Este proyecto está licenciado bajo la **[Licencia MIT](LICENSE)**. Siéntete libre de usarlo y modificarlo según tus necesidades 📝.

---

## 📬 Contacto

¿Tienes preguntas, ideas o encontraste un error? 🐞

- **Issues**: Crea un issue en [GitHub](https://github.com/idgleb/controlIMC/issues).
- **Email**: idgleb@example.com (sustituye con tu correo real si deseas).
- **Twitter**: [@idgleb](https://twitter.com/idgleb) (sustituye con tu cuenta si aplica).

---

🌟 **¡Gracias por usar controlIMC! Toma el control de tu salud con un solo toque.** 🌟