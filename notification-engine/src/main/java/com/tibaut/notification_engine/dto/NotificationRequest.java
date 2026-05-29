package com.tibaut.notification_engine.dto;

import com.tibaut.notification_engine.model.Notification;
import com.tibaut.notification_engine.model.User;
import com.tibaut.notification_engine.repository.NotificationRepository;
import com.tibaut.notification_engine.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class NotificationRequest {
    private Long userId;
    private String message;
    private String sender;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification sendNotification(NotificationRequest request) {
        // Find the user in the database, throw an error if they don't exist
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + request.getUserId()));

        // Map the DTO data over to a real Notification database entity
        Notification notification = new Notification();
        notification.setUser(user);
        notification.setMessage(request.getMessage());
        notification.setSender(request.getSender());
        notification.setStatus("PENDING"); // Default status

        // Save it to the database
        return notificationRepository.save(notification);
    }

}
