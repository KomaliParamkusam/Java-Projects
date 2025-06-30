package com.example15.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example15.service.IUserService;
import com.example15.service.UserServiceImpl;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example15/cfgs/applicationContext.xml");
        IUserService service=ctx.getBean("userService",UserServiceImpl.class);
        try
        {
            String res=service.loginuser("raja", "rani1");
            System.out.println(res);
        }
        catch(DataAccessException d)
        {
            d.printStackTrace();
        }
    }
}
