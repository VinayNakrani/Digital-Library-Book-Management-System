# Digital-Library-Book-Management-System

-Overview : 
  -->The Digital Library Book Management System is a Spring Boot-based REST API that allows users to manage books in a digital library. It provides functionalities for adding, updating, retrieving, searching, and deleting books, along with a system exit function.
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Features : 

  --> Add a Book: Save book details such as title, author, and availability status.

  --> View All Books: Retrieve a list of all books available in the system.

  --> Search a Book by ID: Search for a specific book using its unique ID.

  --> Update Book Details: Modify the details of an existing book.

  --> Delete a Book: Remove a book from the system using its ID.

  --> Exit System: Shut down the application via an API endpoint.
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
- Technologies Used :

  --> Java (Spring Boot): Backend framework for building RESTful APIs.
  
  --> Spring Data JPA: ORM for database interactions.
  
  --> H2/MySQL: Database for storing book information.
  
  --> Maven: Dependency management and project build tool.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

- API Endpoints :
  1.BookController :-
      - POST
        --> /addBook : Add a new book to the system
      -GET
        --> /viewAllBook : Retrieve a list of all books
        --> /searchBook : Search for a book by ID
      PUT
        --> /updateBook : Update book details
  2.SystemController :-
      -GET
        --> /exitSystem : Shut down the application

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Database Schema : 
  --> bookId (Integer, Primary Key, Auto-generated)
  
  --> title (String, Book Title)
  
  --> author (String, Book Author)
  
  --> availabilityStatus (String, Status: Available/Checked Out)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

-How to Run : 
  --> Clone the repository.
  
  --> Open the project in an IDE (IntelliJ, Eclipse, VS Code).
  
  --> Update database configurations in application.properties (if using MySQL).
  
  --> Build and run the application using:
  
  --> mvn spring-boot:run
  
  --> Use Postman or any API testing tool to interact with the API.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------


This project is open-source and available for modification and distribution.
