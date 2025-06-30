package com.example8.beans;


import org.springframework.stereotype.Component;

@Component("report")
public class Report 
{

    public Report() 
    {
        System.out.println("new report instance is created "+this);
    }
    public void display()
    {
        System.out.println("Displaying report form "+this);
    }
    
}
