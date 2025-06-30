package com.example19.onetomany_manytoone.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example19.onetomany_manytoone.daos.IEmpDepartDao;
import com.example19.onetomany_manytoone.entities.Department;
import com.example19.onetomany_manytoone.entities.Employee;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example19/onetomany_manytoone/cfgs/hibernate.xml");
        IEmpDepartDao dao=ctx.getBean("dao",IEmpDepartDao.class);
        Employee emp1=new Employee();
        emp1.setEmp_name("Komali");
        emp1.setEmp_mail("komali@gmail.com");
        Employee emp2=new Employee();
        emp2.setEmp_name("Navya");
        emp2.setEmp_mail("navya@gmail.com");
        Department depart1=new Department();
        depart1.setDepart_name("Software Trainee");
        emp1.setDepartment(depart1);
        emp2.setDepartment(depart1);
        List<Employee> empl=new ArrayList<>();
        empl.add(emp1);
        empl.add(emp2);
        depart1.setEmployees(empl);
        System.out.println(dao.insertEmp(depart1));
        dao.fetchEmp(1);
        
    }
}
