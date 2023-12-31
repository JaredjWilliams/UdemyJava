plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.udemyjavacourse"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.udemyjavacourse"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")

    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("androidx.recyclerview:recyclerview-selection:1.2.0-alpha01")
    implementation("junit:junit:4.12")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:4.8.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}