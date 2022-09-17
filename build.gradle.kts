import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.spring") version "1.6.10"
    id("org.springframework.boot") version "2.5.9"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "io.aretemed.sample.drakkar"
version = "1.0.0-SNAPSHOT"

val springBootVersion by extra("2.1.5.RELEASE")
val kotlinxCoroutinesVersion by extra("1.6.4")

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.aretemed.drakkar:sdk-java:1.0.8")
    implementation("org.springframework.boot:spring-boot-starter-web:${springBootVersion}")
    implementation("org.springframework.boot:spring-boot-starter-webflux:${springBootVersion}")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${kotlinxCoroutinesVersion}")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${kotlinxCoroutinesVersion}")
    testImplementation(kotlin("test"))
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:${kotlinxCoroutinesVersion}")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}