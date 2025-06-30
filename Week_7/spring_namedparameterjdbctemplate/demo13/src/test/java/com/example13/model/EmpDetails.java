package com.example13.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpDetails 
{
    private int empid;
    private String empname;
    private float esal;
    private String email;
}
