package com.tibaut.notification_engine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// A Web Controller that listens for incoming HTTP requests.
// It maps the "/" URL path to the home() method to return a response to the browser.
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Backend system is live!";
    }
} 

    

