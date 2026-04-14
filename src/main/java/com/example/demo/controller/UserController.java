package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UseContainer {
    private final String USERNAME = "admin";
    private final String PASSWORD = "20230140039";

    @GetMapping("/")
    public String loginpage() {
        return "login";
    }
