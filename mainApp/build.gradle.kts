import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        jcenter()
        mavenCentral()
        mavenLocal()

    }
    dependencies {
        classpath(Libs.kotlin_stdlib)
        classpath(Libs.kotlin_jdk8)
        classpath(Libs.kotlin_reflect)
    }
}

repositories {
    jcenter()
    mavenCentral()
    mavenLocal()
}

plugins {
    java
    kotlin("jvm")
    id("org.springframework.boot") version Vers.springBoot
    id("io.spring.dependency-management") version Vers.springDependencyVersion
    kotlin("plugin.spring") version Global.kotlin
    id("io.gitlab.arturbosch.detekt") version Vers.detektVersion
    jacoco
}



detekt {
    config = files("${project.parent?.projectDir}/detekt/config.yml")
    buildUponDefaultConfig = true
}
//
//tasks.test {
//    useJUnitPlatform()
//    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
//    finalizedBy(tasks.jacocoTestCoverageVerification) // report is always generated after tests run
//}
//
//tasks.jacocoTestCoverageVerification {
//    violationRules {
//        rule {
//            limit {
//                minimum = "0.4".toBigDecimal()
//            }
//        }
//    }
//}
//
//tasks.jacocoTestReport {
//    dependsOn(tasks.test) // tests are required to run before generating the report
//}


dependencies {
    // kotlin
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}