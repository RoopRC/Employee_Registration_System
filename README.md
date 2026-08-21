# Employee Registration System

A simple Java Full Stack web application for registering employees and storing their details in a MySQL database.

This project was developed using Java Servlets, JDBC, MySQL, HTML, CSS and Apache Tomcat. It demonstrates the basic implementation of a web application using the Servlet-based architecture and the DAO (Data Access Object) design pattern.

---

## 📌 Project Overview

The Employee Registration System allows users to enter employee information through a web-based registration form.

The application collects:

- Employee Name
- Email
- Address
- Department

After submitting the registration form, the data is sent to a Java Servlet.

The Servlet creates an `Employee` object and passes it to the DAO implementation.

The DAO uses JDBC to connect to MySQL and inserts the employee details into the `employee` table.

### Application Flow

```text
User
  ↓
HTML Registration Form
  ↓
Register Servlet
  ↓
Employee Object
  ↓
EmployeeDAO
  ↓
EmployeeDAOImpl
  ↓
JDBC
  ↓
MySQL Database
