

# Portal for Handling Relationships and CRUD Operations

This project is a portal that encompasses handling of one-to-one, one-to-many, many-to-one, and many-to-many relationships for entities such as Student, Laptop, Course, Book, and Address. It provides Create, Read, Update, and Delete (CRUD) operations for each model.

## Features

- Manages relationships between entities:
  - One-to-One relationship between Student and Address.
  - One-to-One relationship between Laptop and Student.
  - Many-to-Many relationship between Course and Student.
  - Many-to-One relationship between Book and Student.
- Provides CRUD operations for each model:
  - Create, Read, Update, and Delete operations for Student.
  - Create, Read, Update, and Delete operations for Laptop.
  - Create, Read, Update, and Delete operations for Course.
  - Create, Read, Update, and Delete operations for Book.
- Utilizes Java Persistence API (JPA) with Hibernate as the implementation for database management.
- Allows seamless storage and retrieval of data related to students, laptops, courses, books, and addresses.

## Entity Models

The portal consists of the following entity models:

- Student:
  - Represents a student with attributes such as ID, name, age, phone number, branch, and department.
  - One-to-One relationship with Address.
  - One-to-One relationship with Laptop.

- Laptop:
  - Represents a laptop with attributes such as ID, name, brand, and price.
  - One-to-One relationship with Student.

- Course:
  - Represents a course with attributes such as ID, title, description, and duration.
  - Many-to-Many relationship with Student.

- Book:
  - Represents a book with attributes such as ID, title, author, description, and price.
  - Many-to-One relationship with Student.

- Address:
  - Represents an address with attributes such as addressId, landmark, zipcode, district, state, and country.
  - Related to Student through a One-to-One relationship.

## Technologies Used

- Java Persistence API (JPA): For object-relational mapping and managing database operations.
- Hibernate: As the JPA implementation for data persistence.
- Java: The programming language used for the implementation of the portal.
- MySQL (or any other supported database): The database system used for storing the data.

## Getting Started

1. Clone the repository:

```
git clone https://github.com/your-username/portal-project.git
```

2. Configure the database settings:
   - Open the `persistence.xml` file and modify the connection details such as the database URL, username, and password to match your database configuration.

3. Build and run the project:
   - Import the project into your preferred Java IDE.
   - Build the project to resolve dependencies.
   - Run the application to start the portal.

## Usage

- Once the portal is up and running, you can use the provided CRUD operations to interact with the entities.
- Examples of operations you can perform include:
  - Creating a new student record with associated information such as address and laptop.
  - Reading student details, including their associated laptop and courses.
  - Updating student, laptop, course, or book information.
  - Deleting a student, laptop, course, or book from the database.

