# Employee REST API

This project is a simple RESTful CRUD application built using **Spring Boot** with **JPA (Jakarta Persistence API)** for database operations. Through this project, I have learned the following:
- How to build a RESTful API using **Spring Boot**
- Using **Spring Data JPA** to interact with a relational database
- Implementing CRUD operations (Create, Read, Update, Delete) on an Employee entity
- Testing API endpoints using **Postman**
- Managing database connections and configurations in **Spring Boot**

The application provides endpoints to manage employees and allows interaction with a database using RESTful services.

## Features
- Implemented RESTful API with **Spring Boot**
- Used **Spring Data JPA** to interact with a relational database
- CRUD operations (Create, Read, Update, Delete) on Employee entity
- Tested API using **Postman**

## Prerequisites
Before running the project, ensure you have:
- **Java 17+** installed
- **Maven** installed
- **MySQL** set up (You can modify `application.properties` for database configuration)

## SQL Script to Create the Table
The SQL script to create the database table is available in the SQL-scripts folder. Please navigate to that folder and execute the script before running the application.

## Running the Application
1. Clone the repository:
   ```sh
   git clone https://github.com/Nija89/Spring-Boot-Rest-CRUD

2. Navigate into the project directory:
   ```sh
    cd rest-crud-demo

3. Build the project using Maven:
   ```sh
    mvn clean install

4. Run the application:
   ```sh
   mvn spring-boot:run

## API Endpoints

| Method  | Endpoint           | Description              |
|---------|-------------------|--------------------------|
| GET     | `/employees`       | Get all employees       |
| GET     | `/employees/{id}`  | Get an employee by ID   |
| POST    | `/employees`       | Create a new employee   |
| PUT     | `/employees`       | Update an employee      |
| DELETE  | `/employees/{id}`  | Delete an employee      |

## Notes
- Use **Postman** or any API testing tool to test these endpoints.
- Ensure the database is set up correctly before making API requests.

Happy Coding! 🚀
