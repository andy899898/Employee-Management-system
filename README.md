# Employee Management System

A Java-based **Employee Management System** that uses **MySQL** to manage employee records through CRUD operations. The application follows the **DAO (Data Access Object) design pattern** to separate database operations from application logic.

## 📌 Features

* ➕ Add new employees
* ✏️ Update employee details
* 🗑️ Delete employees using Employee ID
* 🔍 Search employees by Employee ID
* 📋 Display all employee records
* 🗄️ MySQL database integration using JDBC
* 💻 Menu-driven console interface

## 🛠️ Technologies Used

* **Java**
* **MySQL**
* **JDBC**
* **DAO Design Pattern**
* **Eclipse / VS Code**

## 🗃️ Database Operations

The project uses `PreparedStatement` for executing SQL queries and performs the following operations:

* `INSERT` – Add a new employee
* `UPDATE` – Update employee details
* `DELETE` – Delete an employee
* `SELECT` – Search and display employee records

## 🏗️ Project Structure

```text
src
└── com.itvedant.emp
    ├── models
    │   └── Employee.java
    │
    ├── repository
    │   ├── Employeedao.java
    │   └── employeeDaoImp.java
    │
    └── test
        └── EmployeeManagement.java
```

## 🔄 Application Flow

```text
EmployeeManagement
        ↓
    Employeedao
        ↓
  employeeDaoImp
        ↓
       JDBC
        ↓
      MySQL
```

The `EmployeeManagement` class handles user interaction, while `employeeDaoImp` performs database operations using JDBC.

## 🗄️ Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE employeecrud;

USE employeecrud;
```

Create the `employee` table:

```sql
CREATE TABLE employee (
    Emp_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    dept VARCHAR(100),
    salary DOUBLE
);
```

## 🔌 JDBC Configuration

Update the database credentials in `employeeDaoImp.java` according to your MySQL configuration:

```java
String user = "root";
String password = "root";
String url = "jdbc:mysql://localhost:3306/employeecrud";
```

Make sure the **MySQL Connector/J JDBC driver** is added to the project.

## ▶️ How to Run

1. Clone the repository.
2. Open the project in **Eclipse or VS Code**.
3. Create the `employeecrud` database in MySQL.
4. Create the `employee` table using the SQL query above.
5. Add the MySQL Connector/J dependency.
6. Update your MySQL username and password.
7. Run `EmployeeManagement.java`.
8. Select an option from the menu.

## 📚 Concepts Demonstrated

This project demonstrates practical implementation of:

* Java OOP
* Classes and Objects
* Constructors
* Interfaces
* DAO Design Pattern
* JDBC
* MySQL
* CRUD Operations
* PreparedStatement
* ResultSet
* Exception Handling
* ArrayList
* Iterator
* Loops and Switch Case
* Database Connectivity

## 🚀 Future Improvements

The project can be further enhanced by adding:

* Update Employee functionality
* Employee login and authentication
* Employee attendance management
* Leave management
* Department management
* Employee search by department
* GUI using Java Swing or JavaFX
* Web application using Spring Boot
* REST APIs

## 👨‍💻 Author

**Anshu Kumar**

---

⭐ If you find this project useful, consider giving the repository a star!
