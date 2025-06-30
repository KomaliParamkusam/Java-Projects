select *from EMPLOYEES;
select *from COUNTRIES;
select *from locations;
select *from jobs;
select *from regions;
select *from empdetails;

select * from books;
select *from products;

select *from customers;

select *from user_profile;
select *from profile_settings;

select *from department;
select *from employee_info; 

drop table user_profile;
drop table profile_settings;

select *from teacher;
select *from subjects;
select *from teacher_subject;
truncate table teacher_subject;

select *from student_info;
select *from courses;

select *from contacts;

select *from jobApplication;
delete from jobApplication where id=0;
truncate table jobApplication;

select *from Employee;
commit;