package com.newproj.projectgradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleApplicationController {

    @GetMapping("/")
    public String home(){
        return("<h1>Welcome To Spring Boot First Project</h1><br>Done on gradle<hr>");
    }
}
