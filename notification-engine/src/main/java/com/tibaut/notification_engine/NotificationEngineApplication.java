/*
 * ROLE: The Main Application Entry Point
 * WHAT IT DOES: Spins up the embedded Tomcat web server, runs the component
 * scanner to activate your classes, and turns on the entire application.
 */

package com.tibaut.notification_engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class NotificationEngineApplication {
	// The entry point of the application. It boots up the embedded Tomcat web server,
	// scans the project for components (like Controllers), and activates URL routing.
	public static void main(String[] args) {
		SpringApplication.run(NotificationEngineApplication.class, args);
	}

}
