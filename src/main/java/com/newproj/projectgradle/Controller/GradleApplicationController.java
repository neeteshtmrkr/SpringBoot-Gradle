package com.newproj.projectgradle.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleApplicationController {

    @GetMapping("/")
    public String home(){
        return("<h1>Welcome To Spring Boot First Project</h1><br>Done on gradle<hr>");
    }

    @GetMapping("/admin")
    public String admin(){
        return("<h1>Welcome Admin!! :)</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return("<h1>Hello User!!</h1>");
    }
}
