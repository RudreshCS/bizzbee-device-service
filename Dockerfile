# Stage 1: Build the application using Maven
FROM maven:3.8.5-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# This packages your app into a .jar file, skipping tests to save build time
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copies the built .jar file from the first stage
COPY --from=build /app/target/*.jar app.jar
# Exposes the port your Spring Boot app is using
EXPOSE 8081
# The command to start the app
ENTRYPOINT ["java", "-jar", "app.jar"]