package com.example10.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentService 
{
    private College college;

    @Autowired
    public void setCollege(College college) 
    {
        this.college = college;
    }
    public void display(String name)
    {
        System.out.println(name+" is studying in:: "+college.getCollegeName());
    }
    
}
