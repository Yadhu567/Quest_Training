-- Create a new database named C2514_DB
CREATE DATABASE C2514_db;
USE c2514_db;

-- Create CUSTOMERS, PRODUCTS ORDERS and  tables.
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    phone_number VARCHAR(15),
    gender ENUM('M','F')
);
CREATE TABLE Products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price INT,
    coffee_origin VARCHAR(100)
);

CREATE TABLE Orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    order_date timestamp,
    product_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (product_id) REFERENCES customers(product_id)
);

-- Insert data in these tables 
INSERT INTO Customers (first_name, last_name, gender, phone_number) VALUES 
('Chris','Martin','M','01123147789'),('Emma','Law','F','01123439899'),
('Mark','Watkins','M','01174592013'),('Daniel','Williams','M',NULL),
('Sarah','Taylor','F','01176348290'),('Katie','Armstrong','F','01145787353'),
('Michael','Bluth','M','01980289282'),('Kat','Nash','F','01176987789'),
('Buster','Bluth','M','01173456782'),('Charlie',NULL,'F','01139287883'),
('Lindsay','Bluth','F','01176923804'),('Harry','Johnson','M',NULL),
('John','Smith','M','01174987221'),('John','Taylor','M',NULL),
('Emma','Smith','F','01176984116'),('Gob','Bluth','M','01176985498'),
('George','Bluth','M','01176984303'),('Lucille','Bluth','F','01198773214'),
('George','Evans','M','01174502933'),('Emily','Simmonds','F','01899284352'),
('John','Smith','M','01144473330'),('Jennifer',NULL,'F',NULL),('Toby','West','M','01176009822'),
('Paul','Edmonds','M','01966947113');


INSERT INTO Products(name,price,coffee_origin)
VALUES ('espresso',2.50,'brazil'), ('macchiatto',3.00,'brazil'),
('cappuccino',3.50,'costa rica'),('latte',3.50,'indonesia'),
('americano',3.00,'brazil'),('flat white',3.50,'indonesia'),
('filter',3.00,'india'),('affogato',2.70,'Italy'),('Frappe',3.50,'Greece');

INSERT INTO Orders (product_id,customer_id,order_time) VALUES 
(1,1,'2017-01-01 08-02-11'),(1,2,'2017-01-01 08-05-16'),
(5,12,'2017-01-01 08-44-34'),(3,4,'2017-01-01 09-20-02'),
(1,9,'2017-01-01 11-51-56'),(6,22,'2017-01-01 13-07-10'),
(1,1,'2017-01-02 08-03-41'),(3,10,'2017-01-02 09-15-22'),
(2,2,'2017-01-02 10-10-10'),(3,13,'2017-01-02 12-07-23'),
(1,1,'2017-01-03 08-13-50'),(7,16,'2017-01-03 08-47-09'),
(6,21,'2017-01-03 09-12-11'),(5,22,'2017-01-03 11-05-33'),
(4,3,'2017-01-03 11-08-55'),(3,11,'2017-01-03 12-02-14'),
(2,23,'2017-01-03 13-41-22'),(1,1,'2017-01-04 08-08-56'),
(3,10,'2017-01-04 11-23-43'),(4,12,'2017-01-05 08-30-09'),
(7,1,'2017-01-06 09-02-47'),(3,18,'2017-01-06 13-23-34'),
(2,16,'2017-01-07 09-12-39'),(2,14,'2017-01-07 11-24-15'),
(4,5,'2017-01-08 08-54-11'),(1,1,'2017-01-09 08-03-11'),
(6,20,'2017-01-10 10-34-12'),(3,3,'2017-01-10 11-02-11'),
(4,24,'2017-01-11 08-39-11'),(4,8,'2017-01-12 13-20-13'),
(1,1,'2017-01-14 08-27-10'),(4,15,'2017-01-15 08-30-56'),
(1,7,'2017-01-16 10-02-11'),(2,10,'2017-01-17 09-50-05'),
(1,1,'2017-01-18 08-22-55'),(3,9,'2017-01-19 09-00-19'),
(7,11,'2017-01-19 11-33-00'),(6,12,'2017-01-20 08-02-21'),
(3,14,'2017-01-21 09-45-50'),(5,2,'2017-01-22 10-10-34'),
(6,24,'2017-01-23 08-32-19'),(6,22,'2017-01-23 08-45-12'),
(6,17,'2017-01-23 12-45-30'),(2,11,'2017-01-24 08-01-27'),
(1,1,'2017-01-25 08-05-13'),(6,11,'2017-01-26 10-49-10'),
(7,3,'2017-01-27 09-23-57'),(7,1,'2017-01-27 10-08-16'),
(3,18,'2017-01-27 10-13-09'),(4,19,'2017-01-27 11-02-40'),
(3,10,'2017-01-28 08-03-21'),(1,2,'2017-01-28 08-33-28'),
(1,12,'2017-01-28 11-55-33'),(1,13,'2017-01-29 09-10-17'),
(6,6,'2017-01-30 10-07-13'),(1,1,'2017-02-01 08-10-14'),
(2,14,'2017-02-02 10-02-11'),(7,10,'2017-02-02 09-43-17'),
(7,20,'2017-02-03 08-33-49'),(4,21,'2017-02-04 09-31-01'),
(5,22,'2017-02-05 09-07-10'),(3,23,'2017-02-06 08-15-10'),
(2,24,'2017-02-07 08-27-26'),(1,1,'2017-02-07 08-45-10'),
(6,11,'2017-02-08 10-37-10'),(3,13,'2017-02-09 08-58-18'),
(3,14,'2017-02-10 09-12-40'),(5,4,'2017-02-10 11-05-34'),
(1,2,'2017-02-11 08-00-38'),(3,8,'2017-02-12 08-08-08'),
(7,20,'2017-02-12 09-22-10'),(1,1,'2017-02-13 08-37-45'),
(5,2,'2017-02-13 12-34-56'),(4,3,'2017-02-14 08-22-43'),
(5,4,'2017-02-14 09-12-56'),(3,5,'2017-02-15 08-09-10'),
(6,7,'2017-02-15 09-05-12'),(1,8,'2017-02-15 09-27-50'),
(2,9,'2017-02-16 08-51-12'),(3,10,'2017-02-16 13-07-46'),
(4,11,'2017-02-17 08-03-55'),(4,12,'2017-02-17 09-12-11'),
(5,10,'2017-02-17 11-41-17'),(6,18,'2017-02-17 13-05-56'),
(7,19,'2017-02-18 08-33-27'),(1,17,'2017-02-19 08-12-31'),
(1,1,'2017-02-20 09-50-17'),(3,5,'2017-02-20 09-51-29'),
(4,6,'2017-02-20 10-43-39'),(3,1,'2017-02-21 08-32-17'),
(1,1,'2017-02-21 10-30-11'),(3,2,'2017-02-21 11-08-45'),
(4,3,'2017-02-22 11-46-32'),(2,15,'2017-02-22 13-35-16'),
(6,13,'2017-02-23 08-34-48'),(4,24,'2017-02-24 08-32-03'),
(2,13,'2017-02-25 08-03-12'),(7,17,'2017-02-25 09-34-23'),
(7,23,'2017-02-25 11-32-54'),(5,12,'2017-02-26 11-47-34'),
(6,4,'2017-02-27 12-12-34'),(1,1,'2017-02-28 08-59-22');

-- From the customers table, select the first name and phone number of all the females who have a last name of Bluth.
SELECT first_name, phone_number
FROM CUSTOMERS
WHERE gender = 'F' AND last_name = 'Bluth';

-- How many male customers don't have a phone number entered into the customers table
SELECT COUNT(*)
FROM CUSTOMERS
WHERE gender = 'M' AND phone_number IS NULL;

-- From the products table, display the names of the products having origin from ‘India’ or ‘indonesia’.
SELECT product_name
FROM PRODUCTS
WHERE origin IN ('India', 'Indonesia');

-- Display names and order time of the customers who have ordered ‘cappucino’
SELECT C.first_name, C.last_name, O.order_date
FROM CUSTOMERS C
JOIN ORDERS O ON C.customer_id = O.customer_id
JOIN PRODUCTS P ON O.product_id = P.product_id
WHERE P.product_name = 'Cappuccino';

-- Display names of all the customers with the names of the products they have ordered
SELECT C.first_name, C.last_name, P.product_name
FROM CUSTOMERS C
JOIN ORDERS O ON C.customer_id = O.customer_id
JOIN PRODUCTS P ON O.product_id = P.product_id;

-- Convert the Orders table into 1NF: Columns: `OrderID`, `CustomerName`, `ProductNames` (where `ProductNames` might contain multiple product names separated by commas).

CREATE TABLE Orders_1NF (
    OrderID INT,
    CustomerName VARCHAR(100),
    ProductName VARCHAR(100)
);

INSERT INTO Orders_1NF (OrderID, CustomerName, ProductName) VALUES
    (1, 'varun', 'laptop'),
    (1, 'varun', 'mobile'),
    (2, 'suresh', 'earbuds'),
    (2, 'suresh', 'charger');

-- Normalize the following table to 2NF: -> 1NF, all values depends directly on the PK ,removes partial dependencies
-- Columns: `StudentID`, `StudentName`, `CourseID`, `CourseName`, `InstructorID`, `InstructorName`

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(100),
    InstructorID INT
);

CREATE TABLE Courses (
    CourseID INT PRIMARY KEY,
    CourseName VARCHAR(100)
);

CREATE TABLE Instructors (
    InstructorID INT PRIMARY KEY,
    InstructorName VARCHAR(100)
);

CREATE TABLE Student_Course_Instructor (
    StudentID INT,
    CourseID INT,
    InstructorID INT,
    PRIMARY KEY (StudentID, CourseID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID),
    FOREIGN KEY (InstructorID) REFERENCES Instructors(InstructorID)
); 

-- Normalize the following table to 3NF:
-- Columns: `SalesID`, `ProductID`, `ProductName`, `CategoryID`, `CategoryName`, `SaleDate`

CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    CategoryID INT,
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(100)
);

CREATE TABLE Sales (
    SalesID INT PRIMARY KEY,
    ProductID INT,
    SaleDate DATE,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Write an SQL statement to create a table in 1NF with the following information:
-- Columns: `BookID`, `Title`, `Authors` (where each book can have multiple authors).

CREATE TABLE Books_1NF (
    BookID INT,
    Title VARCHAR(255),
    Author VARCHAR(100)
);

INSERT INTO Books_1NF (BookID, Title, Author) VALUES
    (1, 'the lost day', 'john'),
    (1, 'the lost day', 'dane'),
    (2, 'the kingdom', 'smith'),
    (2, 'the kingdom', 'sanju');

-- Given a 2NF table with columns `OrderID`, `ProductID`, `ProductName`, and `SupplierName`, 
-- write the SQL commands to normalize this table to 3NF.

CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    SupplierID INT
);

CREATE TABLE Suppliers (
    SupplierID INT PRIMARY KEY,
    SupplierName VARCHAR(100)
);

CREATE TABLE Orders_3NF (
    OrderID INT PRIMARY KEY,
    ProductID INT,
    SupplierID INT,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
);

