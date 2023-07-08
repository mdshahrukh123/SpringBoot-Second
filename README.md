<center>
<h1> EMPLOYEE ADDRESS MANAGEMENT API </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>

This project is a Employee Address Management Api built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model 1

The Employee  data model is defined in the Employeet class, which has the following attributes:
```
Id : unique identifier for each Student
First Name : name of the Student
Last Name : name of the Student
@OneToOne()
adderess : Address of the Student

here i used OneToOne Mappings on Address Table.

```

## Data Model 2

The Address data model is defined in the Address class, which has the following attributes:
```
AddId : unique identifier for each Event
Street : name of the Street
city : City of the employee
State : state of the employee in address table
ZipCode :Code of the State


```

---

## Data Flow

1. The Employee sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add Employee </b>

* PostMapping: /addEmployee
```
This endpoint makes a call to method in EmployeeService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /getAllEmployee
```
This endpoint makes a call to method in EmployeeService class which retrieves data of all job from database. This data is sent to controller which is then sent through the API to client.

```

* GetMapping: "getEmployeeById"
```
This endpoint returns data of specific Employee based on jobdate through API,

```

* PutMapping
```
This endpoint makes a call to method in EmployeeService class which is connected to MySql database. In MySql database we update a Street of Address by Addres Id given through API.
```

* DeleteMapping
```
This endpoint makes a call to method in EmployeeService class which is connected to EmployeeRepository Class and this is connected to MySql-database. In MySql-data base we delete a Job by EmployeeId given through API.
```

---

## Data structure Used
* MySql-DataBase (Persistent database)
```
We have used MySql-DataBase data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Employee Address Managment Api is a Spring Boot project written in Java that enables basic functionality for managing Jobs. This project is built using the Spring Boot framework, which is a popular open-source framework for building production-ready applications. The project uses MySql-DataBase as the data structure to store and manage Employee Address data.

The project includes four main components, the EmployeeController, the EmployeeService, the EmployeeDao, and the Employee class . The EmployeeController class receives requests from the Employee interface layer and delegates them to the EmployeeService. The JobService processes the request and retrieves or updates data from the EmployeeDao. The EmployeeDao uses an MySql-DataBase data structure to store and manage Employee data, and the Employee class defines the Employee data model.

 written by :::: mr. mohd shahrukh
