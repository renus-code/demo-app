package com.example.renu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hell from the CI/CD pipeline app";
    }


}
