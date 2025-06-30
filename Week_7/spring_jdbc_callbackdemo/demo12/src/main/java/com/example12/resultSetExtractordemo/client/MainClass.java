package com.example12.resultSetExtractordemo.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example12.resultSetExtractordemo.model.Employees;
import com.example12.resultSetExtractordemo.service.EmployeeServiceImpl;
import com.example12.resultSetExtractordemo.service.IEmployeeService;


public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example12/resultSetExtractordemo/cfgs/applicationContext.xml");
        IEmployeeService service=ctx.getBean("empService",EmployeeServiceImpl.class);
        try
        {
            List<Employees> emp=service.fetchEmpdetailsByDesign("President", "Programmer");
            emp.forEach(e->
            {
                System.out.println(e);
            });


        }
        catch(DataAccessException d)
        {
            d.printStackTrace();
        }


    }
}
