package com.josecarlos.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to the book catalog!";
    }

}