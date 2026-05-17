/*
 * ROLE: The Notification Database Link (Data Access Object)
 * WHAT IT DOES: Extends JpaRepository to automatically handle all SQL operations
 * (Save, Find, Delete) for the Notification table. Requires no manual SQL code.
 */

package com.tibaut.notification_engine.repository;

import com.tibaut.notification_engine.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
