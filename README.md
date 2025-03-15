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

- Java 17
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

The API provides the following endpoints for user management:

### User Endpoints

Base path: `/api/user`

#### Create User
- **POST** `/api/user`
- Creates a new user
- Request body:
```json
{
    "name": "string",
    "password": "string"
}
```
- Responses:
  - `201 Created`: User created successfully
  - `400 Bad Request`: Invalid user data
  - `500 Internal Server Error`: Server error

#### Get All Users
- **GET** `/api/user`
- Returns all registered users
- Response: Array of user objects
- Status codes:
  - `200 OK`: Success
  - `500 Internal Server Error`: Server error

#### Get User by ID
- **GET** `/api/user/{id}`
- Returns a specific user by ID
- Parameters:
  - `id`: User ID (path parameter)
- Responses:
  - `200 OK`: Success
  - `404 Not Found`: User not found
  - `500 Internal Server Error`: Server error

#### Update User
- **PUT** `/api/user/{id}`
- Updates an existing user
- Parameters:
  - `id`: User ID (path parameter)
- Request body:
```json
{
    "name": "string",
    "password": "string"
}
```
- Responses:
  - `200 OK`: User updated successfully
  - `400 Bad Request`: Invalid user data
  - `404 Not Found`: User not found
  - `500 Internal Server Error`: Server error

#### Delete User
- **DELETE** `/api/user/{id}`
- Deletes a specific user
- Parameters:
  - `id`: User ID (path parameter)
- Responses:
  - `204 No Content`: User deleted successfully
  - `404 Not Found`: User not found
  - `500 Internal Server Error`: Server error

#### Delete All Users
- **DELETE** `/api/user`
- Deletes all users
- Responses:
  - `204 No Content`: All users deleted successfully
  - `500 Internal Server Error`: Server error
