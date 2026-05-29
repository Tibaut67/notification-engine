/*
 * ROLE: The "User" Data Blueprint (Entity)
 * WHAT IT DOES: Defines what a User looks like (ID, Name, Email) and tells
 * Hibernate to create a matching "users" table in the SQL database.
 */

package com.tibaut.notification_engine.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "users") // Maps this class to a database table named "users"
public class User {
    //setters
    //getters
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically increments the ID (1, 2, 3...)
        private Long id;
        private String name;
        private String email;
        private String phoneNumber;


        

}
