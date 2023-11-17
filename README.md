# Movie_Application_backend
MongoDb + Spring
# Spring Boot MongoDB Example

This is a simple Spring Boot project demonstrating how to connect to MongoDB using Spring Data MongoDB.

## Prerequisites

Make sure you have the following installed on your machine:

- Java Development Kit (JDK) 8 or later
- Maven
- MongoDB

## Setup

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/yourusername/spring-boot-mongodb-example.git
    cd spring-boot-mongodb-example
    ```

2. **Configure MongoDB Connection:**

    Open the `src/main/resources/application.properties` file and configure the MongoDB connection properties:

    ```properties
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=mydatabase
    ```

3. **Run the Application:**

    ```bash
    mvn spring-boot:run
    ```

    The Spring Boot application will start, and you should see log messages indicating a successful connection to MongoDB.

4. **Test the Application:**

    You can test the application by making HTTP requests to the provided REST endpoints. For example:

    - To add a movie:

      ```bash
      curl -X POST -H "Content-Type: application/json" -d '{"title":"Movie Title", "year":2022}' http://localhost:8080/movies
      ```

    - To get a movie by ID:

      ```bash
      curl http://localhost:8080/movies/{movieId}
      ```

    Adjust the commands according to your actual use case.

## Project Structure

- `src/main/java/com/example/mongodbexample`: Java source files
  - `Movie`: MongoDB document entity class
  - `MovieRepository`: MongoDB repository interface
  - `MovieService`: Service class for business logic
  - `MovieController`: REST controller for handling HTTP requests
- `src/main/resources`: Application properties and configuration files
- `pom.xml`: Maven project configuration file

