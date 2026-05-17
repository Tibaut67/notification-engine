package com.tibaut.notification_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tibaut.notification_engine.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
