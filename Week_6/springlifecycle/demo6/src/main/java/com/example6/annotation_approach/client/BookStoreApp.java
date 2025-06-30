package com.example6.annotation_approach.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example6.annotation_approach.beans.Books;

public class BookStoreApp 
{
    public static void main(String[] args) 
    {
        try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example6/annotation_approach/cfgs/application.xml");)
        {
            Books book=ctx.getBean("book",Books.class);
            System.out.println(book.sellBook());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
