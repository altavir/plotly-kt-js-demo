plugins {
    kotlin("js") version "1.7.10"
}

group = "centre.sciprog"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("space.kscience:plotlykt-core:0.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
}