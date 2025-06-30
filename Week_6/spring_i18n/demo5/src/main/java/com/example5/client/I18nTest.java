package com.example5.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nTest 
{
    public static void main(String[] args) 
    {
        try(Scanner sc=new Scanner(System.in);
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example5/cfgs/applicationContext.xml");
        )
        {
            System.out.println("Enter language code: ");
            String lan=sc.next();
            System.out.println("Enter country: ");
            String country=sc.next();
            Locale locale=new Locale(lan, country);
            String m1=ctx.getMessage("greeting", new Object[]{}, locale);
            String m2=ctx.getMessage("farewell", new Object[]{}, locale);
            System.out.println(m1+"  "+m2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
