package com.example8.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example8.beans.ReportManager;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example8/cfgs/application.xml");
        ReportManager manager=ctx.getBean("manager",ReportManager.class);
        manager.generateReport();
        manager.generateReport();
        manager.generateReport();
    }
}
