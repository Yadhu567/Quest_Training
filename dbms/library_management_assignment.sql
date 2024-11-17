--Create a new database schema named LibraryManagement
create database library_management;

-- Create a new table named Books
create table Books(
   book_id int primary key auto_increment,
   title varchar(20),
   publication_year year,
   price decimal(10,2),
   author_id int,
   foreign key(author_id) references Authors(author_id)
);

-- Create a new table named Authors
create table Authors(
  author_id int primary key auto_increment,
  first_name varchar(20),
  last_name varchar(20)
);

-- Create a new table named Borrowers
create table Borrowers(
  borrower_id int primary key auto_increment,
  first_name varchar(20),
  last_name varchar(20),
  email varchar(20) unique,
  dob date
);

-- Create a new table named Loans
create table Loans(
  loan_id int primary key auto_increment,
  borrower_id int,
  loan_date date,
  return_date date,
  book_id int,
  foreign key(borrower_id) references Borrowers(borrower_id),
  foreign key(book_id) references Books(book_id)
);

-- Insert 5 records into each of the four tables Authors
insert into authors values
(102,'bill','gates'),
(103,'jeff','bezos'),
(104,'gowtam','adani'),
(105,'mukesh','ambani'),
(106,'elon','musk');

-- Insert 5 records into each of the four tables Books
insert into books values
(23,'aadujeevitham',2023,102,109.99),
(24,'harry poter ',2013,103,109.99),
(25,'ram co andandi',2017,104,109.99),
(26,'malgudi days',2000,102,102.99),
(27,'palace illusion',2008,106,109.99);

-- Insert 5 records into each of the four tables Borrowers
INSERT INTO Borrowers VALUES
(45,'Ravi', 'Sharma', 'ravi@gmail.com', '1990-01-15'),
(46,'Shoan', 'Babu', 'shoan@gmail.com', '1985-06-21'),
(47,'Adarsh', 'J', 'adarsh@gmail.com', '1992-03-10'),
(48,'James', 'Peter', 'james@gmail.com', '1988-12-05'),
(49,'Sanju', 'Davis', 'sanju@gmail.com', '1995-08-23');

-- Insert 5 records into each of the four tables Loans
INSERT INTO Loans VALUES
(11, 45,25, '2024-01-01', '2024-01-15'),
(12, 47,27, '2024-02-01', '2024-02-20'),
(13, 49,26, '2024-03-01', '2024-03-15'),
(14, 49,26, '2024-04-01', '2024-04-10'),
(15, 46,23, '2024-05-01', '2024-05-30');

--Select all columns from the Books table.
select * from books;

--Select the title, price, and publication_year of books where price > 20.
select title, price, publication_year from books where price>20;

--Select the first_name, last_name, and email of borrowers who have borrowed books after '2024-01-01'.
select first_name,last_name,email from borrowers where borrower_id in
(select borrower_id from loans where loan_date>'2024-01-01');

--Update the price of the book with title = 'The Great Gatsby' to 25.00.
update books set price=20.55 where title='The Great Gatsby';

--Delete the book from the Books table where title = 'Moby Dick'.
delete from Loans where book_id = ( select book_id from Books where title = 'moby dick');
delete from books where title='moby dick';

--Alter the Books table to add a new column genre of type VARCHAR(50).
alter table books add genre varchar(20);

--Use the COUNT function to find the total number of borrowers.
select count(borrower_id) from loans;
--Use the SUM function to find the total price of all books in the library.
select sum(price) from books;
--Use the AVG function to calculate the average price of books.
select avg(price) from books;

--Write a subquery to find all books that have been borrowed by any borrower who is over 30 years old.
select title from books where book_id in (
select book_id from loans where borrower_id in(select borrower_id from borrowers
where timestampdiff(year, dob, curdate()) > 30));
