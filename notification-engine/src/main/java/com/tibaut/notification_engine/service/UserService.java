package com.tibaut.notification_engine.service;

import com.tibaut.notification_engine.model.User;
import com.tibaut.notification_engine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Tells Spring Boot this is a business logic component
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        user = this.userRepository.save(user);
        return user;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }





}
