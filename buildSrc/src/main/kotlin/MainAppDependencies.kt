object Vers {
    //Plugins
    val dokkav = "0.9.18"
    val gradle_release_plugin = "1.3.9"
    val asciidoctor = "1.5.9.2"

    //Dependencies
    val junit = "5.2.0"
    val sl4j = "1.7.25"
    val konform = "0.1.0"
    val kotlintest = "3.4.2"
    val money = "1.1"
    val arrow = "0.10.4"

}

object Libs {

    //Dependencies
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Global.kotlin}"
    val kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Global.kotlin}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Global.kotlin}"
    val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Global.kotlin_coroutines}"

    val slf4j_api = "org.slf4j:slf4j-api:${Vers.sl4j}"
    val slf4j_simple = "org.slf4j:slf4j-simple:${Vers.sl4j}"

    val kotlin_logging = "io.github.microutils:kotlin-logging:1.4.9"

    val junit_api = "org.junit.jupiter:junit-jupiter-api:${Vers.junit}"
    val junit_params = "org.junit.jupiter:junit-jupiter-params:${Vers.junit}"
    val junit_engine = "org.junit.jupiter:junit-jupiter-engine:${Vers.junit}"
    val kotlintest = "io.kotlintest:kotlintest-runner-junit5:${Vers.kotlintest}"
    val arrow = "io.arrow-kt:arrow-core:${Vers.arrow}"

    val money = "org.javamoney:moneta:1.3"

    //Mockito
    const val mockito = "org.mockito:mockito-core:2.28.2"
    const val mockk = "io.mockk:mockk:1.9.3"
    const val hamkrest = "com.natpryce:hamkrest:1.7.0.0"
}