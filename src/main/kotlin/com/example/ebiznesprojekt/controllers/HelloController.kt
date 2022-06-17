package com.example.ebiznesprojekt.controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class HelloController {

    @GetMapping("/")
    fun hello(): String {
        return "Hello"
    }
}