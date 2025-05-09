# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/Book-store-management-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 1001
ENTRYPOINT ["java", "-jar", "app.jar"]
