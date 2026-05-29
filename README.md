# Notification Engine Backend

A Java-based REST API built with Spring Boot that handles user registration and processes pending notifications using an in-memory database.

## Tech Stack
* **Java 22**
* **Spring Boot 4.x** (Spring Data JPA, Spring Web)
* **H2 Database** (In-Memory)
* **Maven** (Dependency Management)

### Prerequisites
* Java 22 JDK installed
* IntelliJ IDEA (or any Java IDE)

### Installation & Run
1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Allow Maven to import and load all dependencies.
4. Run the `NotificationEngineApplication.java` entry file.
5. The application will boot up locally on `http://localhost:8080`.

## API Endpoints
### Users
* `GET /api/users` - Retrieve all registered users.
* `POST /api/users` - Register a new user profile.

### Notifications
* `GET /api/notifications` - Retrieve a history of all notifications.
* `POST /api/notifications` - Queue and process a new notification.

## Database Console
You can access the visual database management panel while the application is actively running at:
* **URL:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
