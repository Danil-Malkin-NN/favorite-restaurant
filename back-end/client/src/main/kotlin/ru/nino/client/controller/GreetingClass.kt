package ru.nino.client.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/hello")
class GreetingClass {

    @GetMapping
    fun greeting(): String = "Hello"


}