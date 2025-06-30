package com.example14.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student 
{
    private int sid;
    private String sname;
    private String grade;
    private int marks;
}
