# Use an official Gradle image to build the application
FROM gradle:8.13-jdk21 AS build

# Set the working directory
WORKDIR /home/gradle/project

# Copy the project files
COPY --chown=gradle:gradle . .

# Build the application
RUN gradle build --no-daemon

# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built application from the build stage
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]