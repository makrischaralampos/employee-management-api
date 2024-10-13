# Employee Management System

This project is a full-stack Employee Management System that allows users to perform CRUD operations on employee data
using a RESTful API. The project is built with Spring Boot, Hibernate ORM, and MySQL for database persistence.

## Features

- Create, Read, Update, and Delete (CRUD) employee data.
- Integrated with MySQL for database persistence.
- Query caching for improved performance.
- Robust error handling and validation.

## Prerequisites

To run this project, you need to have the following installed:

- Java 11 or higher
- Maven 3.6+
- MySQL 8.0+
- IDE (e.g., IntelliJ, Eclipse)
- Git

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/makrischaralampos/employee-management-api.git
cd employee-management-system
```

### 2. MySQL Setup

1. Install MySQL if you haven't already.
2. Log into MySQL and create a database for the project:

```sql
CREATE DATABASE employee_management_db;
```

3. Update the MySQL username and password in the `application.properties` file.

#### application.properties:

```properties
#MySQL configuration
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

# Hibernate settings
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update

# Enable query caching
spring.jpa.properties.hibernate.cache.use_second_level_cache=true
spring.jpa.properties.hibernate.cache.region.factory_class=org.hibernate.cache.ehcache.EhCacheRegionFactory
spring.jpa.properties.hibernate.cache.use_query_cache=true
```

4. Run the following SQL script to create the necessary tables if not generated automatically:

```sql
CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(150) UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

### 3. Build and Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

The application will run on `http://localhost:8080`.

### 4. Usage

You can use tools like Postman or curl to interact with the API.

- **GET All Employees:**

```bash
GET http://localhost:8080/api/employees
```

- **GET Employee by ID:**

```bash
GET http://localhost:8080/api/employees/{id}
```

- **Create a New Employee:**

```bash
POST http://localhost:8080/api/employees
Content-Type: application/json

{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```

- **Update an Employee:**

```bash
PUT http://localhost:8080/api/employees/{id}
Content-Type: application/json

{
  "firstName": "UpdatedName",
  "lastName": "UpdatedLastName",
  "email": "updated.email@example.com"
}
```

- **Delete an Employee:**

```bash
DELETE http://localhost:8080/api/employees/{id}
```

### 5. Hibernate & MySQL Details

- The project uses **Hibernate ORM** for database persistence with MySQL as the database.
- The `Employee` entity is mapped to the `employees` table in MySQL.
- Query caching is enabled for frequently accessed data to improve performance.

### 6. Testing

You can run unit tests using the following command:

```bash
mvn test
```

Unit tests cover core functionalities, such as CRUD operations and error handling.

## License

This project is licensed under the MIT License.