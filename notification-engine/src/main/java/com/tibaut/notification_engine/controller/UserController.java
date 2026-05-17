/*
 * ROLE: The User Web API Endpoints
 * WHAT IT DOES: Listens to the internet at "/api/users". Catches web requests
 * (GET to fetch users, POST to create them) and hands the data to the system.
 */

package com.tibaut.notification_engine.controller;

import com.tibaut.notification_engine.model.User;
import com.tibaut.notification_engine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
