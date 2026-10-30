plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.family.kidstv"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.family.kidstv"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        val url = (project.findProperty("SERVER_URL") as String?) ?: "http://192.168.1.10:3000/?key=change-me"
        buildConfigField("String", "SERVER_URL", "\"$url\"")
    }
    buildFeatures { buildConfig = true }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
