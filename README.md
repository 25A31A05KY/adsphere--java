# AdSphere – Advertisement Management System

## Project Overview
AdSphere is a Java-based Advertisement Management System developed using Java and Spring Boot.

This application allows users to create, view, update, and delete advertisements through REST APIs.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database
- REST API
- Git and GitHub

## Features
1. Create advertisements.
2. View all advertisements.
3. Search advertisements by ID.
4. Update advertisements.
5. Delete advertisements.
6. Manage advertisement status.
7. Store advertisement information in a database.

## Project Structure
```text
adsphere-java/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/com/adsphere/
        │   ├── AdSphereApplication.java
        │   ├── controller/
        │   ├── model/
        │   ├── repository/
        │   └── service/
        └── resources/
            └── application.properties
```

## How to Run the Project

### Step 1
Install Java 17.

### Step 2
Install Maven.

### Step 3
Clone the GitHub repository.

### Step 4
Open the project in IntelliJ IDEA or Eclipse.

### Step 5
Run the application using:

```bash
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/ads | Create advertisement |
| GET | /api/ads | View all advertisements |
| GET | /api/ads/1 | View advertisement by ID |
| PUT | /api/ads/1 | Update advertisement |
| DELETE | /api/ads/1 | Delete advertisement |

## Sample Advertisement

```json
{
  "title": "Summer Sale",
  "advertiser": "ABC Company",
  "description": "Special discount campaign",
  "budget": 15000.00,
  "status": "ACTIVE",
  "startDate": "2026-11-10",
  "endDate": "2026-11-30"
}
```

## Expected Output

The application returns advertisement information in JSON format.

## Database
H2 in-memory database is used to store advertisement records.

## Future Enhancements
- User login and authentication.
- Admin dashboard.
- Advertisement analytics.
- PostgreSQL database integration.
- Campaign performance tracking.

## Author
Add your name here.

## License
This project is available for educational purposes.
