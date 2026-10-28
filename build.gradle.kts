plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "bz.ezrides.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "bz.ezrides.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
