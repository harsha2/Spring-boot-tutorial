package com.springboot.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @Value("${welcome.message}")
    private  String WelcomeMessage;
    @GetMapping("/")
    public String HelloWorld(){
        return WelcomeMessage;
    }
}
