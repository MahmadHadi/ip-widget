plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.minimalipwidget"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.minimalipwidget"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
