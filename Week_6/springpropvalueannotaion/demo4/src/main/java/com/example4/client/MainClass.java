package com.example4.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example4.beans.PersonInfo;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=
            new ClassPathXmlApplicationContext("com/example4/cfgs/application.xml");
        PersonInfo info=ctx.getBean("perInfo",PersonInfo.class);
        
        System.out.println(info);
        ctx.close();
      
    }
}
