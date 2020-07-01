package com.stringconcat.dev.course.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}


@RestController
class MainController {

    @GetMapping(path = ["/"])
    //@Suppress("FunctionOnlyReturningConstant")
    fun helloThere(): String {
        return """{"message": "We are deploying it"}"""
    }
}