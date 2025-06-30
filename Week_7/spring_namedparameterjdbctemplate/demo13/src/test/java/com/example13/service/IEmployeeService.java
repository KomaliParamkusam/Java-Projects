package com.example13.service;

import java.util.List;

import com.example13.model.EmpDetails;
import com.example13.model.Employee;
public interface IEmployeeService 
{
    public String fetchEmpNameById(int eno);
    public List<Employee> fetchEmpDetailsByDesign(String d1,String d2,String d3);
    public String fetchInsertedEmpl(EmpDetails emp);
}