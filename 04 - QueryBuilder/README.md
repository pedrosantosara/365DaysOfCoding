# Querybuilder 

> Commit 3 of project [02 - Node Js introduction](https://github.com/pedrosantosara/365DaysOfCoding/tree/main/02%20-%20Node%20Js%20introduction)

This project aims to create a database and develop a CRUD (Create, Read, Update, Delete). Currently, I am implementing the "GET" and "PUT" functionality, which allows me to create new users in the database.

# Technologies used

**Sql** for creating the database
**JavaScript** for connecting to the database and creating the **CRUD system**
**KnexJs** SQL query builder for Node.js


# Features

- Update user data that has already been registered in the database using the **PUT** function
- Create new users in the database using the **"POST"** function
- Security mechanisms have also been applied such as:
  - Encrypting the password using BcryptJs so that it is not exposed in the database
  - Preventing the user from trying to use an email that already exists
  - Requesting the old password before updating the current password
  - Implementation of GET, GETALL, DELETE, and POST methods



# Use



- To use the application, you can download the repository on your machine
- Install the **node_modules** folder by using the command **npm install**

- To use the **Get** method, navigate to localhost/notes/id(notes) in your browser or API client.
- To use the **GetAll** method, navigate to localhost/notes in your browser or API client.
- To use the **Delete** method, navigate to localhost/notes/id(notes) in your browser or API client.


> You can use this json in your insomnia to send a request to  **localhost:(port)/users** to **create** a user using the **POST**  method: 
```
{
	"name": "YourName",
	"email": "email@email.com",
	"password": "password"
}
```
> You can use this **json**  in your insomnia to send a request to **localhost:(port)/users/(id)** to **Update** a user using the **PUT** method: 
```
{
	"name": "YourName",
	"email": "email@email.com",
	"password": "Newpassword",
        "old_password": "password"
}
```

> The **POST** method can be used to create a new note.
```
{
	"title": "Node",
	"description": "Essa é uma nota de exemplo",
	"tags": ["node", "express"],
	"links": ["link", "link2"]
}
```
