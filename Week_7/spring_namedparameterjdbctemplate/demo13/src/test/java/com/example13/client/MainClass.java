package com.example13.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example13.model.EmpDetails;
import com.example13.model.Employee;
import com.example13.service.EmployeeServiceImpl;
import com.example13.service.IEmployeeService;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example13/cfgs/application.xml");
        IEmployeeService service=ctx.getBean("empService",EmployeeServiceImpl.class);
        try
        {
            System.out.println("------------------------------------");
            System.out.println("    Employee Name:: "+service.fetchEmpNameById(200));
            System.out.println("------------------------------------");

        }
        catch(DataAccessException a)
        {
            a.printStackTrace();
        }
        System.out.println("================================================");
        try
        {
            List<Employee> l=service.fetchEmpDetailsByDesign("Programmer", "President", "Sales Manager");
            l.forEach(emp-> 
            {
                System.out.println(emp);
            } );
        }
        catch(DataAccessException a)
        {
            a.printStackTrace();
        }
        try
        {
            EmpDetails emp=new EmpDetails(1051, "ram",20000, "ram@gmail.com");
            String msg=service.fetchInsertedEmpl(emp);
            System.out.println(emp.getEmpname()+" "+msg);

        }
          catch(DataAccessException a)
        {
            a.printStackTrace();
        }

    }
}
