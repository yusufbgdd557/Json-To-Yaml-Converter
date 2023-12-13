# JSON to YAML Converter - Spring Boot Backend

## Overview

This is a simple Spring Boot application that provides an API endpoint to convert JSON data to YAML format. It's built to be easily accessible and testable using tools like Postman.

## Technologies

- Java 17
- Spring 3.2.0


The application will start, and the API will be available at `http://localhost:8080`. You can change the port in the `application.properties` file.

## API Endpoint

### Convert JSON to YAML

- **Endpoint**: `POST /api/v1/convert`
- **Request Body**: JSON data
- **Response**: YAML data

### Example

- **Request:**

    ```json
    POST http://localhost:8080/api/convert

    {
      "name": "Yusuf Bağdad",
      "age": 30,
      "city": "Hatay ",
      "skills": ["Java", "Spring Boot", "React"]
    }
    ```

- **Response:**

    ```yaml
    name: Yusuf Bağdad
    age: 30
    city: Hatay
    skills:
      - Java
      - Spring Boot
      - React
    ```

## Testing with Postman

You can test the JSON to YAML conversion using Postman:

1. Open Postman.
2. Create a new POST request.
3. Set the request URL to `http://localhost:8080/api/v1/convert`.
4. In the request body, select `raw` and set the content type to JSON.
5. Enter your JSON data in the request body.
6. Click the "Send" button.

The response will contain the converted YAML data.
