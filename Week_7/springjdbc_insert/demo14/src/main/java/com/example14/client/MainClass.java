package com.example14.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example14.model.Student;
import com.example14.service.IStudentService;
import com.example14.service.StudentServiceImpl;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example14/cfgs/application.xml");
        IStudentService service=ctx.getBean("stuService",StudentServiceImpl.class);
        try{
            Student s=new Student(208, "navya", "O", 100);
            String msg=service.fetchRegisteredStud(s);
            System.out.println(s.getSname()+" "+msg);
        }
        catch(DataAccessException d)
        {
            d.printStackTrace();
        }
    }
}
