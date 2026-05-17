 /*
  * ROLE: The "Notification" Data Blueprint (Entity)
  * WHAT IT DOES: Defines what a Notification looks like (ID, Message, Status).
  * It uses @ManyToOne to link each notification back to the User who receives it.
  */

 package com.tibaut.notification_engine.model;

 import java.time.LocalDateTime;
 import jakarta.persistence.*;
 import lombok.Getter;
 import lombok.Setter;

    @Setter
    @Getter
    @Entity
    @Table(name = "notifications")
    public class Notification {
        //setters
        //getters
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User receiver;
        private String sender;
        private String message;
        String Status;
        private LocalDateTime createdAt;

        @jakarta.persistence.PrePersist
        protected void onCreate() {
            this.createdAt = LocalDateTime.now();
        }

    }
