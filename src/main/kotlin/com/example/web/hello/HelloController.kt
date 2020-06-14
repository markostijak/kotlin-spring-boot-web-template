package com.example.web.hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController @Autowired constructor(private val helloService: HelloService) {

    @GetMapping("/java")
    fun java(): JavaModel {
        return JavaModel("hello")
    }

    @GetMapping("/kotlin")
    fun kotlin(): KotlinModel {
        return KotlinModel("hello")
    }

    @GetMapping("/controller")
    fun helloKotlin(): String {
        return "Hello from HelloController"
    }

    @GetMapping("/service")
    fun helloFromKotlinService(): String {
        return helloService.hello()
    }

}
