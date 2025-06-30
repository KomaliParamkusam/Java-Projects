package com.example6.annotation_approach.beans;


import java.time.LocalDate;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("com/example6/annotation_approach/properties/book.properties")
@Component("book")
public class Books 
{
    @Value("${book.id}")
    private Integer bId;
    @Value("${book.name}")
    private String bName;
    private LocalDate date;

    public Books() 
    {
        this.date = LocalDate.now();
    }

    @PostConstruct
    public void myInit()
    {
        System.out.println("Init method");
        if(bId==null || bName==null || bId<0)
        {
            throw new IllegalArgumentException("Invalid Values");
        }
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroy method");
        bId=null;
        bName=null;
    }
    public String sellBook()
    {
        return "[ Book Id:: "+bId+"|Book Name:: "+bName+ " is successfully sold on " +date+" ] ";
    }



}
