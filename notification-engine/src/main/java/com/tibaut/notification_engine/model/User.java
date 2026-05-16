package com.tibaut.notification_engine.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users") // Maps this class to a database table named "users"
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically increments the ID (1, 2, 3...)
        private Long id;
        private String name;
        private String email;
        private String phoneNumber;

        //setters
        public void  setId(Long id)  {this.id = id;}
        public void setName(String name)  {this.name = name;}
        public void setEmail(String email)  {this.email = email;}
        public void setPhoneNumber(String phoneNumber)  {this.phoneNumber = phoneNumber;}

        //getters
        public Long getId() {return id;}
        public String getName() {return name;}
        public String getEmail() {return email;}
        public String getPhoneNumber() {return phoneNumber;}

}
