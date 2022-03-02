package com.trading.crypto.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/")
    fun helloWorld() = "Hello World"

    @GetMapping("/restricted")
    fun restricted() = "You have to be logged in"
}
