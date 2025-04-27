# 📚 BookStore Management System - Spring Boot Edition 🚀

Organize your books with ease! A robust and user-friendly Bookstore Management System built with Spring Boot, Thymeleaf, and PostgreSQL. Manage your collection, track your favorites, and experience a seamless book management journey.

![Bookstore Management System](src/main/resources/static/images/image.png)

## 🌟 Key Features

*   **Effortless Book Management:** Add, edit, and remove books with essential details.
*   **Personalized "My Book List":** Create and manage a curated list of your favorite reads.
*   **Responsive & Intuitive UI:** A clean, modern user interface crafted with Thymeleaf and custom CSS.
*   **Robust Error Handling:** User-friendly error pages for a smooth experience.
*   **Database Persistence:** Leverages PostgreSQL for reliable data storage.
*   **Docker-Ready:** Simplified deployment with Docker containerization.

## 💻 Technologies

*   **Backend:**
    *   Java 17
    *   Spring Boot 3.4.3
    *   Spring Data JPA
    *   PostgreSQL
*   **Frontend:**
    *   Thymeleaf
    *   HTML5, CSS3
*   **Build Tool:** Maven
*   **Containerization:** Docker

## 🗂️ Project Structure

```
shubhambhagat3226-bookstore_management_system/
├── Dockerfile
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src/
├── main/
│ ├── java/com/dct/Book_store_management/ # Source Code
│ ├── resources/
│ │ ├── application.properties # Configuration
│ │ ├── static/ # CSS, Images
│ │ └── templates/ # Thymeleaf Templates
└── test/
└── java/com/dct/Book_store_management/ # Tests
```


*   **`src/main/java`:** Core application logic (controllers, entities, services, repositories).
*   **`src/main/resources`:** UI templates, static assets, and application settings.
*   **`Dockerfile`:** Docker configuration for containerizing the application.
*   **`pom.xml`:** Maven project definition and dependencies.

## 🚀 Setup Guide

### Prerequisites

*   **Java 17:** Ensure you have JDK 17 installed.
*   **Maven:** Required for local builds.
*   **PostgreSQL:** A running PostgreSQL database instance.
*   **Docker:** (Optional) For containerized deployment.
*   **Git:** To clone the repository.

### Local Installation

1.  **Clone the Repository:**

    ```bash
    git clone https://github.com/shubhambhagat3226/bookstore_management_system.git
    cd bookstore_management_system
    ```

2.  **Database Configuration:**

    *   Create a PostgreSQL database named `dct` (or update the `application.properties` file).
    *   Update `src/main/resources/application.properties` with your database credentials:

        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/dct
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        server.port=1001
        ```

3.  **Build & Run:**

    ```bash
    ./mvnw clean package -DskipTests
    java -jar target/Book-store-management-0.0.1-SNAPSHOT.jar
    ```

4.  **Access the Application:**

    Open your browser and navigate to `http://localhost:1001`.

### Docker Deployment

1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/shubhambhagat3226/bookstore_management_system.git
    cd bookstore_management_system
    ```
2.  **Configure Database**

    Use a hosted PostgreSQL instance or set up a local one with Docker:

    ```bash
    docker run -d --name postgres-db -e POSTGRES_DB=dct -e POSTGRES_USER=root -e POSTGRES_PASSWORD=your_password -p 5432:5432 postgres
    ```

    *Update `application.properties` with the appropriate database URL.*
3.  **Build the Docker Image:**

    ```bash
    docker build -t bookstore-management-system .
    ```

4.  **Run the Application:**

    ```bash
    docker run -p 1001:1001 --name bookstore-app bookstore-management-system
    ```

5.  **Access the Application:**

    Open your browser and go to `http://localhost:1001`.

## 🧭 Usage

*   **Home:** `/` - Welcome page.
*   **Register Book:** `/book_register` - Add a new book to the system.
*   **Available Books:** `/available_books` - View and manage all available books.
*   **My Book List:** `/my_books` - View and manage your personal book list.

## 🔗 API Endpoints

| Endpoint              | Method | Description                                    |
| :-------------------- | :----- | :--------------------------------------------- |
| `/`                   | GET    | Home page                                      |
| `/book_register`      | GET    | Book registration form                          |
| `/available_books`    | GET    | List of all books                              |
| `/my_books`           | GET    | Personal book list                             |
| `/save`               | POST   | Save a new or edited book                      |
| `/mylist/{id}`        | GET    | Add a book to My List                          |
| `/edit/{id}`          | GET    | Edit a book                                    |
| `/delete/{id}`        | GET    | Delete a book from the system                  |
| `/deleteMyList/{id}`  | GET    | Remove a book from your personal list         |
| `/error`              | GET    | Custom error page                              |

## 🤝 Contributing

Contributions are welcome! Special thanks to **@collaborator-id** for their support.  To contribute:

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/your-feature`).
3.  Make your changes and commit them (`git commit -m "Add your message"`).
4.  Push to your branch (`git push origin feature/your-feature`).
5.  Open a Pull Request.

## 🧑‍💻 Author

*   Shubham Bhagat - [shubhambhagat3226](https://github.com/shubhambhagat3226)
*   Collaborator - [@dev-himanshu-karnwal](https://github.com/dev-himanshu-karnwal)

Give this repository a ⭐ if you find it helpful!
