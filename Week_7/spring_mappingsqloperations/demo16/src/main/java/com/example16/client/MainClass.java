package com.example16.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example16.service.EmployeeServiceImpl;
import com.example16.service.IEmployeeService;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example16/cfgs/applicationContext.xml");
        IEmployeeService service=ctx.getBean("empService",EmployeeServiceImpl.class);
        try
        {
            String name=service.fetchEmpName(166);
            System.out.println("EMPLOYEE NAME:: "+name);
            
        }
        catch(DataAccessException d)
        {
            d.printStackTrace();
        }
    }
}
