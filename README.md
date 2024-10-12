# Employee Management RESTful API

A simple REST API built with Spring Boot for managing employees (CRUD operations) with H2 in-memory database.

## Features

- Create, read, update, and delete employees.
- Filter employees by email or department.
- Full exception handling with meaningful HTTP status codes.

## Technologies Used

- Java
- Spring Boot (Spring Web, Spring Data JPA)
- H2 Database
- Maven
- Lombok

## Installation and Setup

1. Clone the repository:

```bash
git clone https://github.com/makrischaralampos/employee-management-api.git
cd employee-management-api
```

2. Build the project:

```bash
mvn clean install
```

3. Run the application:

```bash
mvn spring-boot:run
```

The API will be accessible at `http://localhost:8080/api/employees`.

## Databse Configuration (H2)

The project uses the H2 in-memory database, so no external database configuration is needed.

To access the H2 console:

- URL: `http://localhost:8080/h2-console`
- JDBC-URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: (leave empty)