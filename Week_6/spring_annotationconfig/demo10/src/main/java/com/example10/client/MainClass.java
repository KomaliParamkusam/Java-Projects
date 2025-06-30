package com.example10.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example10.beans.StudentService;
import com.example10.cfgs.AppConfig;

public class MainClass 
{
    public static void main(String[] args) 
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service=ctx.getBean(StudentService.class);
        service.display("Komali");

    }
}
