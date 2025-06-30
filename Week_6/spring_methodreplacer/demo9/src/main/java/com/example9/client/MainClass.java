package com.example9.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example9.beans.DiscountService;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example9/cfgs/application.xml");
        DiscountService service=ctx.getBean("service",DiscountService.class);
       
        System.out.println("Discount :: "+service.discount(1000));
        
    }
}
