package com.lgfas.testesecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    @GetMapping
    public String teste() {
        return "Hello, World!";
    }

    @GetMapping("/users")
    public String users() {
        return "Authorized User";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Authorized Manager";
    }
}
