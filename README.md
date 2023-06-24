<center>
<h1> URL HIT COUNTER APPLICATION BY API </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a Url-Hit-Counter API built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The visitor(user) data model is defined in the Visitor class, which has the following attributes:
```
visitorId : unique identifier for each user

Name : name of the Visitor

visitCoount : Count of visit a perticuler user
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add Visitor </b>

* PostMapping: /Visitor
```
This endpoint makes a call to method in visitorService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /getAllVisitor
```
This endpoint makes a call to method in visitService class which retrieves data of all visitor from database. This data is sent to controller which is then sent through the API to client.
```

* GetMapping: "getUser/{api/visit-count-app/id/{id}}"
```
This endpoint returns data of specific user based on userid through API
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Url Hit Counter api  is a Spring Boot project written in Java that enables basic functionality for managing users. This project is built using the Spring Boot framework, which is a popular open-source framework for building production-ready applications. The project uses ArrayList as the data structure to store and manage user data.

The project includes four main components, the (visitor) UserManagementController, the UserService, the UserDao, and the User class. The UserController class receives requests from the user interface layer and delegates them to the UserService. The UserService processes the request and retrieves or updates data from the UserDao. The UserDao uses an ArrayList data structure to store and manage user data, and the User class defines the user data model.

 written by :::: mr. mohd shahrukh
