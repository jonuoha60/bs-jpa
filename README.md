# 📕 BOOK Database Application

A full-stack Spring Boot application that allows users to **Create**, **Read**, **Update**, and **Delete (CRUD)** book records using a MySQL database. This project demonstrates how to integrate a relational database with a Spring Boot backend while serving dynamic HTML views using Thymeleaf.

---

## 🚀 Features

- ✅ Add new books to the database
- ✅ View a list of all books
- ✅ Update books details
- ✅ Delete books
- ✅ Styled with CSS
- ✅ RESTful endpoints
- ✅ MVC architecture

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- MySQL
- Thymeleaf
- HTML/CSS
- Maven

---

## 🛠️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/movies-database.git
cd movies-database

2. Configure MySQL Database
Create a database in MySQL (e.g., books):


CREATE DATABASE books;
Update your application.properties:

application.properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/books
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update

3. Run the Application
Using terminal or your IDE:

./mvnw spring-boot:run

http://localhost:8080/books
