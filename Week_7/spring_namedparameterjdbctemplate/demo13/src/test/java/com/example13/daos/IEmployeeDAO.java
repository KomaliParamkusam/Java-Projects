package com.example13.daos;

import java.util.List;

import com.example13.model.EmpDetails;
import com.example13.model.Employee;

public interface IEmployeeDAO 
{
    public String getEmpNameById(int eno);
    public List<Employee> getEmpByDesign(String d1,String d2,String d3);
    public int insertEmployee(EmpDetails emp);
    
}
