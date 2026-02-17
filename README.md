# Shipment-Tracking-App

A Spring Boot REST API for managing and tracking shipments.

This project demonstrates how to build a backend service using Spring Boot, JPA, and Hibernate to create, update, and manage shipment data such as tracking numbers, origins, destinations, and shipment status.

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- H2 / MySQL (configurable)

---

## Features

- Create shipments
- Retrieve all shipments
- Retrieve shipment by ID
- Update shipment details
- Delete shipments
- Automatic timestamp management (`createdAt`, `updatedAt`)
- Enum-based shipment status
- Layered architecture (Controller → Service → Repository)

---

## Project Structure

Shipment-Tracking-App
├── demo
│ ├── src/main/java/com/example/shipment
│ │ ├── ShipmentApplication.java
│ │ ├── Shipment.java
│ │ ├── ShipmentStatus.java
│ │ ├── ShipmentRepository.java
│ │ ├── ShipmentService.java
│ │ └── ShipmentController.java
│ └── src/main/resources
│ └── application.properties
├── .gitignore
└── README.md

## Automatic Timestamp Handling
The entity uses JPA lifecycle annotations:

@PrePersist sets createdAt and updatedAt

@PreUpdate updates updatedAt

## Learning Purpose

This project was built to practice:

Spring Boot fundamentals

## REST API development

JPA and Hibernate mappings

Layered architecture

Lombok usage

Entity lifecycle callbacks

## Possible Improvements
Add Swagger/OpenAPI documentation

Add Spring Security (authentication and authorization)

Add DTO layer and validation

Add global exception handling

Connect to a production database (MySQL/PostgreSQL)

---

## Author
GitHub: https://github.com/333ihab

### License
This project is open-source and available for learning and improvement.

---
## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/333ihab/Shipment-Tracking-App.git
cd Shipment-Tracking-App/demo
2. Build the Project
mvn clean install
3. Run the Application
mvn spring-boot:run
Or run the generated JAR file:

java -jar target/demo-0.0.1-SNAPSHOT.jar
The application will start at:

http://localhost:8080
API Endpoints
Method	Endpoint	Description
GET	/api/shipments	Get all shipments
GET	/api/shipments/{id}	Get shipment by ID
POST	/api/shipments	Create a shipment
PUT	/api/shipments/{id}	Update a shipment
DELETE	/api/shipments/{id}	Delete a shipment
Shipment Entity Fields
Field	Type	Description
id	Long	Auto-generated ID
trackingNum	String	Unique tracking number
origin	String	Shipment origin
destination	String	Shipment destination
status	Enum	ORDER_PLACED, IN_TRANSIT, DELIVERED, etc.
createdAt	LocalDateTime	Automatically set when created
updatedAt	LocalDateTime	Automatically updated on modification
currentLocation	String	Current shipment location
estimatedDelivery	String	Estimated delivery date
Example Request (POST)
{
  "trackingNum": "TRK123456",
  "origin": "Casablanca",
  "destination": "Rabat",
  "status": "ORDER_PLACED"
}



