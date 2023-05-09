package com.example.library_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {
    @GetMapping("/hello")
    public String getHello(){
        return "HelloWorld";
    }

    @GetMapping ("/new")
    public String putHello(){
        return "This is my new request";
    }

}
