// File: build.gradle.kts (Project level)
plugins {
    kotlin("jvm") version "1.9.10"
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0") // Updated Gradle plugin
        classpath(kotlin("gradle-plugin", version = "1.9.10")) // Kotlin plugin
    }
}
