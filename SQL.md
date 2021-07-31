CREATE DATABASE APIDevelopSpringBoot;

use APIDevelopSpringBoot;

CREATE TABLE StaffDemo(person_name varchar(50),id varchar(50),
department varchar(50),
floor int,
manager varchar(50),PRIMARY KEY (id));

INSERT INTO StaffDemo(person_name,id,department,floor,manager)
values("Joe Bloggs","137136","edb","9","Jane Doe");

select * from StaffDemo where id = '137136'