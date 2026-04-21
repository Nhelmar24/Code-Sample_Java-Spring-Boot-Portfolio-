package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // <--- Check this!
public class GreetingController {

    @GetMapping("/greet") // <--- Check this!
    public String sayHello(@RequestParam(value = "name", defaultValue = "FullStackDev") String name) {
        return String.format("Success! Hello, %s. Your Java backend is live.", name);
    }
}