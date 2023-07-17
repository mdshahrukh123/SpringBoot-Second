<center>
<h1> STUDENT MANAGEMENT MAPPINGS API </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>

This project is a Studentst Management Api built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model 1

The Students data model is defined in the Student class, which has the following attributes:
```
Id : unique identifier for each Student
Name : name of the Student
Age : Organisation Student Age
adderess : Address of the Student

```

## Data Model 2

The course data model is defined in the course class, which has the following attributes:
```
courseId : unique identifier for each Course
Name : name of the Course
title : titel of Course
description : description of the Course
Duratione :Time of the Course



```

---

## Data Flow

1. The Students sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add Student </b>

* PostMapping: /addStudent
```
This endpoint makes a call to method in StudentService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /getAllStudent
```
This endpoint makes a call to method in jobService class which retrieves data of all job from database. This data is sent to controller which is then sent through the API to client.
In this Api I used Custom Query (Select * from Job_Portal where title = : titel ( whatever I passed))
```

* GetMapping: "getEventByDate"
```
This endpoint returns data of specific job based on jobdate through API,
In this Api I used custom Finder
```

* PutMapping
```
This endpoint makes a call to method in jobService class which is connected to H2 database. In H2 database we update a Descripton of Job by Job Id given through API.
```

* DeleteMapping
```
This endpoint makes a call to method in jobService class which is connected to jobRepository Class and this is connected to H2-database. In H2-database we delete a Job by jobId given through API.
```

---

## Data structure Used
* H2-DataBase (In memory database)
```
We have used H2-DataBase data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Students Event Managment Api is a Spring Boot project written in Java that enables basic functionality for managing Jobs. This project is built using the Spring Boot framework, which is a popular open-source framework for building production-ready applications. The project uses H2-DataBase as the data structure to store and manage job Portal data.

The project includes four main components, the JobController, the JobService, the JobDao, and the Job class and JobType Enum class. The JobController class receives requests from the JOb interface layer and delegates them to the JobService. The JobService processes the request and retrieves or updates data from the JobDao. The JobDao uses an H2-DataBase data structure to store and manage Job data, and the Job class defines the Job data model.

 written by :::: mr. mohd shahrukh
