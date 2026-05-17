/*
 * ROLE: The User Database Link (Data Access Object)
 * WHAT IT DOES: Extends JpaRepository to automatically handle all SQL operations
 * (Save, Find, Delete) for the User table. Requires no manual SQL code.
 */

package com.tibaut.notification_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tibaut.notification_engine.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
