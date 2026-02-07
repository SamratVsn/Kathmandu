# Kathmandu My-City App 🏛️🕉️🛍️

![Kotlin](https://img.shields.io/badge/kotlin-1.9.0-blue.svg?logo=kotlin&logoColor=white) ![Compose](https://img.shields.io/badge/Jetpack%20Compose-M3-green.svg?logo=android) ![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg?logo=android)

A modern Android application showcasing the best of Kathmandu through curated local recommendations. Built with Jetpack Compose as the final project for Unit 4 of the Android Basics with Compose course.

## 📱 About

Kathmandu My-City is a recommendation app that helps users discover the cultural richness and iconic destinations of Kathmandu, Nepal. The app features an intuitive, category-based interface highlighting must-visit locations across special places, temples, shopping areas, and tourist destinations.

## ✨ Features



- **Categorized Recommendations**

- 🏛️ **Special Places**: Iconic and historically significant buildings across Kathmandu

- 🕉️ **Temples**: Prominent Hindu and Buddhist temples, including Pashupatinath

- 🛍️ **Major Shops**: Popular shopping streets, markets, and commercial areas

- 🗺️ **Tourist Destinations**: Well-known attractions and places of interest for visitors

- **Seamless Navigation**

- Smooth transitions between categories and location details

- State preservation across configuration changes (e.g., screen rotation)

## 🛠️ Technical Stack
* **Language:** [Kotlin](https://kotlinlang.org/)
* **UI Framework:** [Jetpack Compose](https://developer.android.com/jetbrains/compose) (Material Design 3)
* **Architecture:** MVVM (Model-View-ViewModel)
* **Navigation:** Jetpack Navigation Compose
* **State Management:** ViewModel & StateFlow

## 📂 Project Structure

```text
com.example.kathmandu
├── data                # Local data provider (DataSource)
├── model               # Data models and UI State (Places.kt, CityUiState)
├── ui                  # UI Layer
│   ├── theme           # Material 3 design system configuration
│   ├── CityViewModel   # Business logic and state management
│   ├── CityScreen.kt   # Root Composable and navigation entry point
│   └── [Screens]       # Feature-specific Composables (Start, Categories, Options)
└── MainActivity.kt     # App entry point

## 🎨 Design Highlights

- Custom Material 3 color scheme reflecting Kathmandu's cultural aesthetics
- Thoughtfully crafted typography and shapes
- Consistent theming throughout the application

## 🏗️ Architecture & Implementation

This project demonstrates proficiency in modern Android development practices:

- **Navigation & State Management**: Utilizes Compose Navigation component with ViewModel and UI State for robust state management
- **Material 3 Components**: Full implementation of M3 design guidelines for a polished, contemporary look
- **Adaptive Layouts**: Responsive UI components that adjust to different screen sizes and orientations



## 📚 Course Reference

This project was developed as part of the **Android Basics with Compose** course, specifically Unit 4 focusing on Adaptive Layouts.

## 🚀 Getting Started

1. Clone this repository
```bash
   git clone https://github.com/SamratVsn/Kathmandu.git
```

2. Open the project in Android Studio (Hedgehog or later recommended)

3. Build and run the application on an emulator or physical device

## 📄 License

This project is part of an educational course and follows the Android Basics with Compose curriculum guidelines.

## 👨‍💻 Developer

**Samrat Vsn**
- GitHub: [@SamratVsn](https://github.com/SamratVsn)
- LinkedIn: [@SamratVsn](https://linkedin.com/in/samratvsn)
- Instagram: [@SamratVsn](https://www.instagram.com/samratvsn/)

---

*Discover Kathmandu, one recommendation at a time* 🇳🇵
