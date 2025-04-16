plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlinx-serialization")
}

android {
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
    }

    namespace = "eu.kanade.tachiyomi.lib.randomua"
}

repositories {
    google()
    mavenCentral()
    maven(url = "https://jitpack.io") // ini penting!
}

dependencies {
    compileOnly(libs.bundles.common)
    compileOnly "com.github.mihonapp:extensions-lib:$libVersion"
}
