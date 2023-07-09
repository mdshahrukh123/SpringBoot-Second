<center>
<h1> ECOMMERCE API MANAGEMENT API </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>

This project is a Ecommerce  Management Api built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model 1

The User  data model is defined in the User class, which has the following attributes:
```
Id : unique identifier for each Student
 Name : name of the Student
Email : email  of the Student
Password : password of user
Mobile Number : number of user
@OneToMany()
adderess : Address of the User

here i used OneToMany Mappings on Address Table.

```

## Data Model 2

The Address data model is defined in the Address class, which has the following attributes:
```
AddId : unique identifier for each Event
LandMark : name of the LandMark
city : City of the employee
State : state of the employee in address table
ZipCode :Code of the State

In Address Table we can see the foreign key of user table.

```
## Data Model 3

The Product  data model is defined in the Product class, which has the following attributes:
```
Id : unique identifier for each product
 Name : name of the product
price : price of product
description : its description field
Category : category is an ENUM type class there is field (ELECTRONIC, MOBILES, SHOES, CLOTHES)
Brand  : its a brand feild of product


```
## Data Model 4

The Order  data model is defined in the Order class, which has the following attributes:
```
Id : unique identifier for each Order
ProductQuantity : Quantity of product

@OneToOne()
adderess : Address of the User

@OneToOne()
Product : Product of the User

@OneToOne()
User  user

here i used OneToOne Mappings on Address Table, Product table , User table.

```
---

## Data Flow

1. The User sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add User </b>

* PostMapping: /addUser
```
This endpoint makes a call to method in UserService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /getAllUser
```
This endpoint makes a call to method in UserService class which retrieves data of all job from database. This data is sent to controller which is then sent through the API to client.

```

* GetMapping: "getUserById"
```
This endpoint returns data of specific User based on jobdate through API,

```

* PutMapping
```
This endpoint makes a call to method in OrderService class which is connected to MySql database. In MySql database we update a Street of Address by Addres Id given through API.
```

* DeleteMapping
```
This endpoint makes a call to method in ProductService class which is connected to ProductRepository Class and this is connected to MySql-database. In MySql-data base we delete a Product by ProductId given through API.
```

---

## Data structure Used
* MySql-DataBase (Persistent database)
```
We have used MySql-DataBase data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Ecommerce  Managment Api is a Spring Boot project written in Java that enables basic functionality for managing Order, Product and user. This project is built using the Spring Boot framework, which is a popular open-source framework for building production-ready applications. The project uses MySql-DataBase as the data structure to store and manage User Address data.

The project includes four main components, the UserController, the UserService, the UserDao, and the User class . The UserController class receives requests from the User interface layer and delegates them to the UserService. The UserService processes the request and retrieves or updates data from the UserDao. The UserDao uses an MySql-DataBase data structure to store and manage User data, and the User class defines the User data model.

 written by :::: mr. mohd shahrukh
