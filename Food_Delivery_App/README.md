# REST API for an Online Food Delivery Application

* A SpringBoot project which provides REST API for an Online Food Delivery application. This API performs all the fundamental CRUD operations of any Online Food Delivery platform with user validation at every step.

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

## Modules

* Signup, Login/Logout Module
* Restaurant Module
* Customer Module
* Order and Items Module
* Bill Module

## Features

* Customer and Admin authentication & validation with session uuid.
* Admin Features:
    * Administrator Role of the entire application
    * Only registered admins with valid session token can add/update/delete restaurants or customer from main database
    * Admin can access the details of different customers, restaurants and orders
* Customer Features:
    * Registering themselves with application, and logging in to get the valid session token
    * Viewing list of available items and ordering it
    * Only logged in users view cart details, place an order, update and access other features
    
## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties](https://github.com/AamirSohail763/Online-food-delivery-app/blob/main/Food_Delivery_App/src/main/resources/application.properties) file. 
* Update the port number, username and password as per your local database config.

```
    server.port=8008

    spring.datasource.url=jdbc:mysql://localhost:3306/cabdb;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root

```

## API Root Endpoint

`http://localhost:8008/swagger-ui.html`

### Sample API Response for Customer Login

`POST   localhost:8008/login`

* Request Body

```
    {
        
        "password": "Swarali@123",
        "userId": 1,
        "userName": "swarali"
    }
```

* Response

```
    {
         UserSession(id=2, userId=1, UUID=000267, timeStamp=2022-11-14T14:12:43.129790400)

    }
```
The Food Delivery Platform API is a backend application that provides RESTful endpoints for users to order food from restaurants. It is built using Java and the Spring Boot framework, making it easy to develop, maintain, and scale. The API follows a structured data flow, with controllers handling incoming requests, services implementing business logic, and repositories managing data access to the MySQL database.

Users can register, log in, and place orders for food items. The admin has additional privileges to add new food items and perform CRUD operations on food items. The data structure includes entities for users and food items, each with specific attributes to store relevant information.

This API lays the foundation for building a fully functional food delivery platform that can be further expanded with additional features like payment processing, delivery tracking, and user reviews. It is designed to be secure, scalable, and easily extensible to meet the needs of a real-world food delivery service.