package com.tibaut.notification_engine.repository;

import com.tibaut.notification_engine.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tibaut.notification_engine.model.User;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
