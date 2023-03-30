drop database carsshopNew;

create database carsshopNew;

use carsshopNew;


create table employee(
                         id int not null auto_increment primary key,
                         name VARCHAR(30),
                         position varchar(20),
                         phone VARCHAR(15)
);


create table newCars(
                        id INT NOT NULL auto_increment primary key,
                        employee_id INT NOT NULL,
                        model varchar(20) NOT NULL,
                        foreign key(employee_id) references employee(id)
);

create table child(
                         id int not null auto_increment primary key,
                         name VARCHAR(30),
                         phone VARCHAR(15)
);



INSERT into employee(name, position, phone) values ('Kira','manager','095-558-96-58');
INSERT into employee(name, position, phone) values ('Misha','haf-manager','065-487-85-56');
INSERT into employee(name, position, phone) values ('Arsen','director','066-538-22-77');

INSERT into child(name, phone) values ('Ira','095-558-96-00');
INSERT into child(name,  phone) values ('Vasya','065-487-85-11');
INSERT into child(name,  phone) values ('Sasha','066-538-22-22');


insert into newCars(employee_id, model) values (1, 'A5');
insert into newCars(employee_id, model) values (2, 'panamera');
insert into newCars(employee_id, model) values (2, 'caymen S');

