package com.example13.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
    private int eid;
    private String ename;
    private String job_id;
    private String job;
    private int salary;
}
