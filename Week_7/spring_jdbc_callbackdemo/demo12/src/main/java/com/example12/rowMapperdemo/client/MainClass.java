package com.example12.rowMapperdemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example12.rowMapperdemo.service.LocationServiceImp;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example12/rowMapperdemo/cfgs/application.xml");
        LocationServiceImp service=ctx.getBean("locService",LocationServiceImp.class);
        System.out.println(service.fetchLocationById(1800));
        System.out.println("------------------------------------------------------------------------------------");

    }
}
