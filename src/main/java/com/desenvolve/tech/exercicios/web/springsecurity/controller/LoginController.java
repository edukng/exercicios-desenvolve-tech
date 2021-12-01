package com.desenvolve.tech.exercicios.web.springsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String showLoginPage() {
        return "welcome";
    }

}