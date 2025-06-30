create table secure_data(data_id number,data_name varchar2(15),password varchar(20));
select *from secure_data;
delete from secure_data where data_id=601;
alter table secure_data modify password varchar2(50);