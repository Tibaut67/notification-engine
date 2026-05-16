package com.tibaut.notification_engine.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String receiver;
    private String sender;
    private String message;
    String Status;
    private LocalDateTime createdAt;

    @jakarta.persistence.PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    //setters
    public void setId(Long id)  {this.id = id;}
    public void setReceiver(String receiver)  {this.receiver = receiver;}
    public void setSender(String sender)  {this.sender = sender;}
    public void setMessage(String message)  {this.message = message;}
    public void setStatus(String Status)  {this.Status = Status;}
    public void setCreatedAt(LocalDateTime createdAt)  {this.createdAt = createdAt;}

    //getters
    public Long getId() {return id;}
    public String getReceiver() {return receiver;}
    public String getSender() {return sender;}
    public String getMessage() {return message;}
    public String getStatus() {return Status;}
    public LocalDateTime getCreatedAt() {return createdAt;}
}
