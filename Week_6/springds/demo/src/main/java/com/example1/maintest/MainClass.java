package com.example1.maintest;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example1.controller.CustomerOpertionsController;
import com.example1.model.Customer;

public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the customer name: ");
        String name=sc.next();
        System.out.print("Enter the customer address: ");
        String address=sc.next();
        System.out.print("Enter customer bill amount: ");
        double billamnt=sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount=sc.nextDouble();
        Customer cust=new Customer();
        cust.setCname(name);
        cust.setCaddrs(address);
        cust.setBill(billamnt);
        cust.setDiscount(discount);
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/example1/cfgs/applicationContext.xml");
        CustomerOpertionsController controller=ctx.getBean("custController",CustomerOpertionsController.class);
        try
        {
            String res=controller.processCustomer(cust);
            System.out.println(res);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        


    }
}