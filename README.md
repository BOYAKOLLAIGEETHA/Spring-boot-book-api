# 📚 Spring Boot Book Management API

A simple REST API to manage books using **Spring Boot**, **MySQL**, and **JPA**.  
Supports full CRUD operations and search functionality.

---

## 🚀 Tech Stack
- Java 11
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

---

## ✅ Features
- Add a book
- Get all books
- Get book by ID
- Update a book
- Delete a book
- Search books by author

---

## 🔗 API Endpoints

| Method | Endpoint                    | Description          |
|--------|-----------------------------|----------------------|
| POST   | `/books`                    | Add a book           |
| GET    | `/books`                    | Get all books        |
| GET    | `/books/{id}`               | Get book by ID       |
| PUT    | `/books/{id}`               | Update book by ID    |
| DELETE | `/books/{id}`               | Delete book by ID    |
| GET    | `/books/search?author=xyz`  | Search by author     |

---

## 💻 How to Run

1. Clone the project  
   ```
   git clone https://github.com/BOYAKOLLAIGEETHA/Spring-boot-book-api.git
   cd Spring-boot-book-api
   ```

2. Open the project in STS or IntelliJ

3. Set your MySQL username/password in `application.properties`

4. Run the app:  
   ```
   mvn spring-boot:run
   ```

5. Use Postman to test APIs on:  
   ```
   http://localhost:8080
   ```

---

## ✨ Author

Made with ❤️ by [Kollai Geetha](https://github.com/BOYAKOLLAIGEETHA)
