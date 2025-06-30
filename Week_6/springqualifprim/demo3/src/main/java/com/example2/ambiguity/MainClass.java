package com.example2.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Car car=(Car)ctx.getBean("car",Car.class);
        car.start();
        ctx.close();
    }
}