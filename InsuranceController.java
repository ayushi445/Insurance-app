package com.project.staragile.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Insurance App!";
    }
}
