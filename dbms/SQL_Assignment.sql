create table Books(
book_id int primary key auto_increment,
title varchar(20),
publication_year year,
author_id int,
price decimal(10,2),
foreign key(author_id) references Authors(author_id)
);

create table Authors(
  author_id int primary key auto_increment,
  first_name varchar(20),
  last_name varchar(20));

create table Borrowers(
  borrower_id int primary key auto_increment,
  first_name varchar(20),
  last_name varchar(20),
  email varchar(20) unique,
  dob date);
  
create table Loans(
  loan_id int primary key auto_increment,
  borrower_id int,
  book_id int,
  loan_date date,
  return_date date,
  foreign key(borrower_id) references Borrowers(borrower_id),
  foreign key(book_id) references Books(book_id));
  
insert into authors values
(102,'bill','gates'),
(103,'jeff','bezos'),
(104,'gowtam','adani'),
(105,'mukesh','ambani'),
(106,'elon','musk');

insert into books values
(23,'aadujeevitham',2023,102,109.99),
(24,'harry poter ',2013,103,109.99),
(25,'ram co andandi',2017,104,109.99),
(26,'malgudi days',2000,102,102.99),
(27,'palace illusion',2008,106,109.99);

insert into books values(28,'palace illusion',2008,106,109.99);

INSERT INTO Borrowers VALUES
(45,'Ravi', 'Sharma', 'ravi@gmail.com', '1990-01-15'),
(46,'Shoan', 'Babu', 'shoan@gmail.com', '1985-06-21'),
(47,'Adarsh', 'J', 'adarsh@gmail.com', '1992-03-10'),
(48,'James', 'Peter', 'james@gmail.com', '1988-12-05'),
(49,'Sanju', 'Davis', 'sanju@gmail.com', '1995-08-23');

INSERT INTO Loans VALUES
(11, 45,25, '2024-01-01', '2024-01-15'),
(12, 47,27, '2024-02-01', '2024-02-20'),
(13, 49,26, '2024-03-01', '2024-03-15'),
(14, 49,26, '2024-04-01', '2024-04-10'),
(15, 46,23, '2024-05-01', '2024-05-30');


select * from books;
select title, price, publication_year from books where price>20;

select first_name,last_name,email from borrowers where borrower_id in
(select borrower_id from loans where loan_date>'2024-01-01');

update books set title='The Great Gatsby'where book_id=23 ; 

update books set title='moby dick'where book_id=24 ; 
update books set price=20.55 where title='The Great Gatsby'; 

delete from Loans where book_id = ( select book_id from Books where title = "moby dick");

delete from books where title='moby dick';

alter table books add genre varchar(20);

select count(borrower_id) from loans;
select sum(price) from books; 
select avg(price) from books;

select title from books where book_id in (
select book_id from loans where borrower_id in(select borrower_id from borrowers
where timestampdiff(year, dob, curdate()) > 30));
