package com.example7.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example7.beans.NotificationManager;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example7/cfgs/notification.xml");
        NotificationManager manager=ctx.getBean("manager",NotificationManager.class);
        manager.notifyUser();
    }
}
