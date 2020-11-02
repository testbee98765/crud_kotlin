package com.example.demo6

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Demo6Application {

    @GetMapping
    fun hi(): String{
        return "Hi"
    }
}


fun main(args: Array<String>) {
    runApplication<Demo6Application>(*args)
}
