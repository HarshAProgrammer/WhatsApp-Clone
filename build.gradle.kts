// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
    id ("com.android.library") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.7.0" apply false

}
buildscript {

    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44.2")
        classpath ("com.google.gms:google-services:4.3.15")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
    }
}