package com.tibaut.notification_engine.service;

import com.tibaut.notification_engine.model.Notification;
import com.tibaut.notification_engine.model.User;
import com.tibaut.notification_engine.repository.NotificationRepository;
import com.tibaut.notification_engine.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;
    private final UserRepository userRepository;

    public NotificationService(NotificationRepository notificationRepository, UserRepository userRepository) {
        this.notificationRepository = notificationRepository;
        this.userRepository = userRepository;
    }

    public Notification sendNotification(Long userId, String message) {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isPresent()){
            User recipient = userOptional.get();
            Notification notification = new Notification();
            notification.setReceiver(recipient);
            notification.setMessage(message);
            notification.setStatus("PENDING");
            
            return this.notificationRepository.save(notification);
        }
        else {
            throw new RuntimeException("User not found with id: " + userId);
        }
    }

}
