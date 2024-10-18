# JDBC Practice Repository

This repository contains simple examples of using JDBC (Java Database Connectivity) to interact with a MySQL database. The examples focus on establishing a database connection, inserting data into a table, and managing resources efficiently.

## Table of Contents

- [Introduction](#introduction)
- [Requirements](#requirements)
- [Setup Instructions](#setup-instructions)
- [Implemented Features](#implemented-features)
    - [1. Database Connection Setup](#1-database-connection-setup)
    - [2. Insert Data into Students Table](#2-insert-data-into-students-table)
    - [3. Closing Resources with Utility Method](#3-closing-resources-with-utility-method)

---

## Introduction

This project demonstrates the basics of interacting with a MySQL database using JDBC in Java. The primary focus is on:
1. Establishing a connection to a MySQL database.
2. Performing data insertion into the `students` table.
3. Efficiently managing database resources like `Connection`, `PreparedStatement`, and `ResultSet` using a utility method.

---

## Requirements

- Java JDK 22 or higher
- MySQL database installed (with the `jdbc_practice` schema)
- JDBC MySQL Connector JAR file
- Eclipse IDE (optional)

---

## Setup Instructions

1. Clone this repository:
   ```bash
   git clone <repository-url>
   ```
2. Add the MySQL JDBC connector JAR file to your project in Eclipse:
- Right-click on your project > Build Path > Configure Build Path > Libraries > Add External JARs and select the JDBC JAR file.
3. Start MySQL server and create a database schema:
```bash
CREATE DATABASE jdbc_practice;
```
4. Create the students table:
```bash
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT
);
```
## Implemented Features
1. [Connection Testing](src/Day1/Begin.java)
The first step was to test the database connection. We wrote a simple program to check if the connection to the MySQL database could be successfully established. This program also included a test query using `ResultSet` to confirm that data could be retrieved.

2. [Database Connection Utility](src/Day1/DatabaseConnection.java)
After confirming the connection works, we created a reusable `DatabaseConnection` class to manage the connection to the MySQL database. This class allows us to avoid repetitive connection setup code and provides a standardized way to connect to the database in all subsequent operations.

3. [Insert Data into Students Table](src/Day1/Insertion.java)
We then implemented the functionality to insert data into the `students` table. A class called `Insertion` was created, which uses a prepared statement to insert the student’s name and age into the table.

4. [Closing Resources with Utility Method](src/Day1/DatabaseConnection.java)
Finally, we created a utility method `closeConnection()` in the `DatabaseConnection` class to close resources like `Connection`, `PreparedStatement`, and `ResultSet`. This ensures that resources are properly released after use, preventing memory leaks and connection issues.