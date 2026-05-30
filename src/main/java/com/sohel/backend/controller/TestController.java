package com.sohel.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/admin")
    public String adminAccess() {
        return "Welcome ADMIN";
    }

    @GetMapping("/api/user")
    public String userAccess() {
        return "Welcome USER";
    }
}