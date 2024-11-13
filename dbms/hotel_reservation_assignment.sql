-- Create a new database schema named hotel reservation management
create database hotel_reservation_system;

-- Create a new table named customers
create table customers(
  customer_id int primary key auto_increment,
  first_name varchar(30) not null,
  last_name varchar(30) not null,
  email varchar(30)not null,
  phone_number varchar(15),
  address varchar(200));

-- Create a new table named rooms
create table rooms(
  room_id int primary key auto_increment,
  room_type enum('single', 'double', 'suite') not null,
  price_per_night decimal(10, 2) not null,
  status enum('available', 'occupied', 'under maintenance') not null,
  floor_number int);

-- Create a new table named reservations
create table reservations (
    reservation_id int primary key auto_increment,
    customer_id int,
    room_id int,
    reservation_date date not null,
    check_in_date date not null,
    check_out_date date not null,
    status enum('confirmed', 'cancelled', 'completed') not null,
    foreign key (customer_id) references customers(customer_id),
    foreign key (room_id) references rooms(room_id));

-- Create a new table named payments
create table payments (
    payment_id int primary key auto_increment,
    reservation_id int,
    payment_date date not null,
    amount_paid decimal(10, 2) not null,
    payment_method enum('credit card', 'cash') NOT NULL,
    foreign key (reservation_id) references reservations(reservation_id) on delete cascade); 
  
-- Create a new table named staff
create table staff (
    staff_id int primary key auto_increment,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    role enum('receptionist', 'manager', 'housekeeper') not null,
    hire_date date not null);

-- Create a new table named roomassignments
create table roomassignments (
    assignment_id int primary key auto_increment,
    staff_id int,
    room_id int,
    assignment_date date not null,
    task_description varchar(255),
    foreign key (staff_id) references staff(staff_id),
    foreign key (room_id) references rooms(room_id)
);

-- Insert 5 records into each of the four tables customers
insert into customers(first_name,last_name,email,phone_number,address) values
('shoan','drake','shoan@gmal.com','2342245677','banglore'),
('jason','roy','jason@gmal.com','2342256677','kolkata'),
('eliot','anderson','eliot@gmal.com','9942245677','mumbai'),
('james','blake','james@gmal.com','2342248877','chennai'),
('alan','smith','alan@gmal.com','88342245677','bihar');

-- Insert 5 records into each of the four tables rooms
insert into rooms(room_type, price_per_night, status, floor_number) values
('single',2000.50,'available',2),
('suite',1500.00,'occupied',3),
('double',3000.10,'under maintenance',1),
('suite',4000.70,'occupied',3),
('single',5000.00,'available',5);

-- Insert 5 records into each of the four tables reservations
insert into reservations(customer_id, room_id, reservation_date, check_in_date, check_out_date, status) values 
(3, 1, '2024-11-01', '2024-11-10', '2024-11-12', 'confirmed'),
(2, 2, '2024-11-02', '2024-11-11', '2024-11-15', 'completed'),
(1, 3, '2024-11-03', '2024-11-12', '2024-11-18', 'confirmed'),
(5, 4, '2024-11-04', '2024-11-13', '2024-11-14', 'cancelled'),
(4, 5, '2024-11-05', '2024-11-14', '2024-11-16', 'confirmed');

-- Insert 5 records into each of the four tables payments
insert into payments(reservation_id,payment_date,amount_paid,payment_method) values
(1, '2024-11-02', 250.00, 'credit card'),
(2, '2024-11-12', 340.30, 'cash'),
(3, '2024-11-13', 500.00, 'credit card'),
(4, '2024-11-15', 800.00, 'cash'),
(5, '2024-11-16', 700.30, 'cash');

-- Insert 5 records into each of the four tables staff
insert into staff(first_name, last_name, role, hire_date) values
('williams', 'jackson', 'receptionist', '2023-01-15'),
('george', 'brown', 'manager', '2022-06-10'),
('anderson', 'green', 'housekeeper', '2023-08-22'),
('tessa', 'john', 'housekeeper', '2023-09-15'),
('thomas', 'muller', 'receptionist', '2024-02-05');

-- Insert 5 records into each of the four tables roomassignments
insert into roomassignments(staff_id, room_id, assignment_date, task_description) values
(1, 3, '2024-11-05', 'Clean room'),
(2, 4, '2024-11-06', 'Maintenance check'),
(3, 1, '2024-11-07', 'Clean room'),
(4, 2, '2024-11-08', 'Clean room'),
(5, 5, '2024-11-09', 'Maintenance check');


 
-- Retrieve all information about rooms available on a specific floor.
select * from rooms as r join reservations as s on r.room_id=s.room_id 
where floor_number=2 and r.status='available';


-- List all reservations with customer details (first name, last name, email) sorted by check-in date (earliest first).
select reservation_id, first_name, last_name, email, check_in_date, check_out_date 
from customers as c join reservations as r on c.customer_id=r.customer_id order by check_in_date desc; 


-- Find all customers who have reserved rooms for more than 5 nights.
select first_name, last_name from customers as c join reservations as r on c.customer_id=r.customer_id 
where datediff(check_out_date,check_in_date)>5; 


-- Get the total amount paid for each reservation.
select reservation_id, sum(amount_paid) as total_amount from payments group by reservation_id; 

-- Find the average room price for each room type.
select room_type, avg(price_per_night) as room_price from rooms group by room_type order by room_price;


-- Display the total revenue generated from all reservations in the last month.
select sum(amount_paid) as total_amount from payments where  
payment_date >= date_sub(curdate(), interval 1 month);


-- Find the staff members who have been assigned the most rooms for cleaning or maintenance in the last month.
select count(assignment_id) as num_assignments,s.first_name, s.last_name from staff as s join 
roomassignments as r on s.staff_id=r.staff_id where assignment_date>=date_sub(curdate(), interval 1 month) group by
assignment_id order by num_assignments desc;


-- Retrieve the most recent reservation for each customer.
select first_name,last_name, max(r.reservation_date) as last_reservation_date from reservations r join customers c 
on r.customer_id=c.customer_id group by c.customer_id;


-- Delete a reservation and all corresponding payment records.
delete from reservations where reservation_id=1;

-- Room Availability Check: Create a query that checks which rooms are available for a given date range (i.e., not reserved for those dates). 
select room_id, room_type, price_per_night from rooms where status='available' and room_id not in
(select room_id from reservations where check_in_date>'2024-11-08' and check_out_date<='2024-11-12');

select * from customers as c left join reservations as r  on c.customer_id=r.customer_id union 
select * from customers as c right join reservations as r  on c.customer_id=r.customer_id;

 