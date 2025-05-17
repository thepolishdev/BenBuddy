package com.thepolishdev.benbuddy.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DashboardController {

    @GetMapping("/")
    public String dashboard() {
        return "Welcome to the BenBuddy Dashboard!";
    }
}
