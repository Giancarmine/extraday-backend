# Extraday Backend

Spring Boot REST API backend with MongoDB database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Running the Application](#running-the-application)
  - [Using Gradle (Development)](#1-using-gradle-development)
  - [Using Docker](#2-using-docker)
  - [Using Docker Compose](#3-using-docker-compose-recommended)
- [MongoDB Connection](#mongodb-connection)
- [API Endpoints](#api-endpoints)

## Prerequisites

- Java 21
- Gradle
- Docker
- Docker Compose

## Running the Application

There are several ways to run this application:

### 1. Using Gradle (Development)

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080`

### 2. Using Docker

Build and run the Docker image:

```bash
# Build the image
docker build -t extraday-backend .
```

```bash
# Run the container
docker run -p 8080:8080 extraday-backend
```

### 3. Using Docker Compose (Recommended)

This method will start both the application and MongoDB:

```bash
docker compose up --build
```

The services will be available at:

- Application: `http://localhost:8080`
- MongoDB: `mongodb://localhost:27017`

## MongoDB Connection

To connect to MongoDB using a client:

- Host: `localhost`
- Port: `27017`
- Username: `root`
- Password: `local`
- Connection string: `mongodb://root:local@localhost:27017/extradaydb`

## API Endpoints

### GET /

Returns a simple JSON response with status 201 Created.

Sample response:

```json
{
  "message": "Your first return value"
}
```
