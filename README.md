👩‍💻 Author

**Sarita Jaiswal**

Acces UI : http://localhost:8080/swagger-ui/index.html#

**Employee Management System**

A RESTful Employee Management application built using Spring Boot
, PostgreSQL
, and Amazon SQS
.

The application supports employee CRUD operations, database integration, global exception handling, and asynchronous message processing using AWS SQS.

Features
* Employee CRUD APIs
* Spring Data JPA Integration
* PostgreSQL Database Support
* AWS SQS Integration
* Global Exception Handling
* Maven Build Support
* Layered Architecture
* RESTful API Design

Tech Stack

| Technology      | Version                |
| --------------- | ---------------------- |
| Java            | 17                     |
| Spring Boot     | 3.3.5                  |
| Spring Data JPA | Latest                 |
| PostgreSQL      | Latest                 |
| AWS SQS         | Spring Cloud AWS 3.1.1 |
| Maven           | Latest                 |


Project Structure

## Project Structure

```text
employee-management
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── company
│       │           └── employee
│       │               ├── controller
│       │               ├── service
│       │               ├── repository
│       │               ├── entity
│       │               ├── exception
│       │               ├── config
│       │               └── EmployeeApplication.java
│       │
│       └── resources
│           ├── application.properties
│           └── application-dev.properties
│
├── pom.xml
│
└── README.md
```

Prerequisites

Before running the project, ensure the following are installed:

* Java 17
* Maven
* PostgreSQL
* AWS Account (for SQS integration)

Useful tools:

* IntelliJ IDEA
* Postman
* pgAdmin
