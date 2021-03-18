package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {

    @GetMapping("/heroku")
    public String heroku() {
        return "Hello, from Heroku";
    }
}
