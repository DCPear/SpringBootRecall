CREATE DATABASE APIDevelopSpringBoot;

use APIDevelopSpringBoot;

CREATE TABLE HrDetails(person_name varchar(50),id varchar(50),
department varchar(50),
floor int,
manager varchar(50),PRIMARY KEY (id));

INSERT INTO HrDetails(person_name,id,department,floor,manager)
values("Joe Bloggs","137136","edb","9","Jane Doe");

select * from HrDetails where id = '137136'

Note: Ensure table name does not start with class name. Otherwise JPA conflict between
class name and table name can happen.