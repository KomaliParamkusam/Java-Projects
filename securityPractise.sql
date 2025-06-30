create table users(username varchar2(50) primary key,password varchar2(100),enabled number(1) not null);
create table authorities(username varchar2(50) not null,authority varchar2(50) not null,foreign key(username) references users(username));
insert into users values('emp_komali','1234',1);
insert into authorities values('emp_komali','ROLE_EMPLOYEE');

select *from users;
select *from authorities;
update  users set password='${noop}hr123' where username='hr_admin';
drop table authorities;
drop table users;
commit;