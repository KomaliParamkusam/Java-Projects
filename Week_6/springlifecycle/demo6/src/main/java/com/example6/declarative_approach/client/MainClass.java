package com.example6.declarative_approach.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example6.declarative_approach.beans.StudentInfo;

public class MainClass 
{
    public static void main(String[] args) 
    {
        try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example6/declarative_approach/cfgs/applicationContext.xml");)
        {
        StudentInfo student=ctx.getBean("student",StudentInfo.class);
        String result=student.generateGrade();
        System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
