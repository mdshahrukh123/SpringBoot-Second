<center>
<h1> JOB SEARCH PORTAL API </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>

This project is a Job Search Portal Api built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The JOb data model is defined in the Job class, which has the following attributes:
```
JobId : unique identifier for each user
CompanyName : name of the Company
Salary : Organisation employee salary
Email adderess : Email of the Company
title : title of the job
description : description about job
JobType  : which type of Job like (HR, IT, SALES, DEVELOPER, FULL_STACK, NON_IT)
postedDate : which is define, when this post is uploaded
RecruiterNam : Here is recruiter name 
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
<b> Add Job </b>

* PostMapping: /addJob
```
This endpoint makes a call to method in jobService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /getAllJobByTitle
```
This endpoint makes a call to method in jobService class which retrieves data of all job from database. This data is sent to controller which is then sent through the API to client.
In this Api I used Custom Query (Select * from Job_Portal where title = : titel ( whatever I passed))
```

* GetMapping: "getUserByPostedDate"
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

The JOb Search Portal is a Spring Boot project written in Java that enables basic functionality for managing Jobs. This project is built using the Spring Boot framework, which is a popular open-source framework for building production-ready applications. The project uses H2-DataBase as the data structure to store and manage job Portal data.

The project includes four main components, the JobController, the JobService, the JobDao, and the Job class and JobType Enum class. The JobController class receives requests from the JOb interface layer and delegates them to the JobService. The JobService processes the request and retrieves or updates data from the JobDao. The JobDao uses an H2-DataBase data structure to store and manage Job data, and the Job class defines the Job data model.

 written by :::: mr. mohd shahrukh
