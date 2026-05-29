/*
 * ROLE: The Notification Web API Endpoints
 * WHAT IT DOES: Listens to the internet at "/api/notifications". Catches incoming
 * request payloads, extracts the recipient ID and message, and passes them to the service.
 */

package com.tibaut.notification_engine.controller;

import com.tibaut.notification_engine.dto.NotificationRequest;
import com.tibaut.notification_engine.model.Notification;
import com.tibaut.notification_engine.repository.NotificationRepository;
import com.tibaut.notification_engine.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
@CrossOrigin(origins = "http://localhost:3000") 
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private NotificationRepository notificationRepository;

    @PostMapping
    public Notification createNotification(@RequestBody NotificationRequest request) {
        return notificationService.sendNotification(request.getUserId(), request.getMessage());
    }

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

}
