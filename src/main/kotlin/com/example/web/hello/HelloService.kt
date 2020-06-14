package com.example.web.hello

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun hello(): String {
        return "Hello from HelloService"
    }

}
