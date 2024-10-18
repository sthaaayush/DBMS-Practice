# JDBC Practice Project

This repository contains Java programs demonstrating the usage of JDBC (Java Database Connectivity) with MySQL. The project covers basic database operations such as connecting to a database, executing SQL queries, and handling results.

## Overview
This project is designed to help you practice the essential concepts of JDBC, such as:
- Connecting to a MySQL database
- Performing CRUD operations (Create, Read, Update, Delete)
- Using `Statement` and `ResultSet` to interact with a database
- Implementing best practices for resource management in JDBC

## Database Setup
Before running the code, ensure you have a MySQL database set up with the following configuration:
- **Database**: `jdbc_practice`
- **Table**: `students`

  ```sql
  CREATE TABLE students (
      id INT PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(100),
      age INT
  );
### Requirements
- JDK 22
- MySQL server (via XAMPP or another method)
- MySQL Connector/J (JDBC driver) included in the classpath