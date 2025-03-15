# Bookstore Management System

![Bookstore Management System](src/main/resources/static/images/image.png)

A simple yet robust **Bookstore Management System** built with **Spring Boot**, **Thymeleaf**, and **PostgreSQL**. This application allows users to manage a collection of books, including adding, editing, deleting, and maintaining a personal list of favorite books. It features a clean, responsive UI and is containerized using Docker for easy deployment.

---

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
  - [Prerequisites](#prerequisites)
  - [Local Setup](#local-setup)
  - [Docker Setup](#docker-setup)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **Book Management**: Add, edit, and delete books with details like name, author, and price.
- **My Book List**: Add books to a personal list and remove them as needed.
- **Responsive UI**: A clean, user-friendly interface built with Thymeleaf and custom CSS.
- **Error Handling**: Custom error pages for a better user experience.
- **Database Integration**: Persistent storage using PostgreSQL.
- **Docker Support**: Easily deploy the application using Docker.

---

## Technologies Used

- **Backend**: 
  - Java 17
  - Spring Boot 3.4.3
  - Spring Data JPA
  - PostgreSQL
- **Frontend**: 
  - Thymeleaf
  - HTML5, CSS3
- **Build Tools**: 
  - Maven
- **Containerization**: 
  - Docker
- **Dependencies**: 
  - Lombok (for reducing boilerplate code)
  - Spring Boot DevTools (for development)

---

## Project Structure

```
shubhambhagat3226-bookstore_management_system/
├── Dockerfile
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/dct/Book_store_management/
    │   │       ├── BookStoreManagementApplication.java
    │   │       ├── controller/
    │   │       ├── entity/
    │   │       ├── repository/
    │   │       └── service/
    │   └── resources/
    │       ├── application.properties
    │       ├── static/
    │       │   ├── css/
    │       │   └── images/
    │       └── templates/
    └── test/
        └── java/
```

- **`src/main/java`**: Contains the Java source code (controllers, entities, services, etc.).
- **`src/main/resources`**: Holds static files (CSS, images) and Thymeleaf templates.
- **`Dockerfile`**: Defines the Docker build process for the application.
- **`pom.xml`**: Maven configuration file with dependencies and plugins.

---

## Setup Instructions

### Prerequisites

- **Java 17**: Ensure JDK 17 is installed.
- **Maven**: For building the project locally.
- **PostgreSQL**: A running PostgreSQL instance (local or hosted).
- **Docker**: (Optional) For containerized deployment.
- **Git**: To clone the repository.

### Local Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/shubhambhagat3226/bookstore_management_system.git
   cd bookstore_management_system
   ```

2. **Configure the Database**:
   - Create a PostgreSQL database named `dct` (or modify `application.properties` to match your database).
   - Update `src/main/resources/application.properties` with your PostgreSQL credentials:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/dct
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     server.port=1001
     ```

3. **Build and Run the Application**:
   ```bash
   ./mvnw clean package -DskipTests
   java -jar target/Book-store-management-0.0.1-SNAPSHOT.jar
   ```

4. **Access the Application**:
   Open your browser and go to `http://localhost:1001`.

### Docker Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/shubhambhagat3226/bookstore_management_system.git
   cd bookstore_management_system
   ```

2. **Configure the Database**:
   - Use a hosted PostgreSQL instance (e.g., Render, as in `application.properties`) or set up a local one with Docker:
     ```bash
     docker run -d --name postgres-db -e POSTGRES_DB=dct -e POSTGRES_USER=root -e POSTGRES_PASSWORD=your_password -p 5432:5432 postgres
     ```
   - Update `application.properties` with the appropriate database URL.

3. **Build and Run with Docker**:
   ```bash
   docker build -t bookstore-management-system .
   docker run -p 1001:1001 --name bookstore-app bookstore-management-system
   ```

4. **Access the Application**:
   Visit `http://localhost:1001` in your browser.

---

## Usage

- **Home Page**: Navigate to `/` to see the welcome page.
- **Register a Book**: Go to `/book_register` to add a new book.
- **View Available Books**: Visit `/available_books` to see all books and perform actions (edit, delete, add to My List).
- **My Book List**: Check `/my_books` to view and manage your personal book list.

---

## Endpoints

| Endpoint             | Method | Description                     |
|----------------------|--------|---------------------------------|
| `/`                  | GET    | Home page                   |
| `/book_register`     | GET    | Book registration form      |
| `/available_books`   | GET    | List of all books           |
| `/my_books`          | GET    | Personal book list          |
| `/save`              | POST   | Save a new or edited book   |
| `/mylist/{id}`       | GET    | Add a book to My List       |
| `/edit/{id}`         | GET    | Edit a book                 |
| `/delete/{id}`       | GET    | Delete a book               |
| `/deleteMyList/{id}` | GET    | Remove a book from My List  |
| `/error`             | GET    | Custom error page           |

---

## Contributing

Contributions are welcome! Special thanks to **@collaborator-id** for their support. To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes and commit them (`git commit -m "Add your message"`).
4. Push to your branch (`git push origin feature/your-feature`).
5. Open a Pull Request.

---

**Author**: Shubham Bhagat  
**GitHub**: [shubhambhagat3226](https://github.com/shubhambhagat3226)  
**Collaborator**: [@dev-himanshu-karnwal](https://github.com/dev-himanshu-karnwal)  

Feel free to star ⭐ this repository if you find it useful!
