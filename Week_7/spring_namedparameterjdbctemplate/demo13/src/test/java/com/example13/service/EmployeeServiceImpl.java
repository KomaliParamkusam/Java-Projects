package com.example13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example13.daos.IEmployeeDAO;
import com.example13.model.EmpDetails;
import com.example13.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private IEmployeeDAO dao;

    @Override
    public String fetchEmpNameById(int eno) 
    {
        String name=dao.getEmpNameById(eno);
        return name;
    }

    @Override
    public List<Employee> fetchEmpDetailsByDesign(String d1, String d2, String d3) 
    {
        return dao.getEmpByDesign(d1, d2, d3);
    }

    @Override
    public String fetchInsertedEmpl(EmpDetails emp) 
    {
        int c=dao.insertEmployee(emp);
        return c==0?"Employee Not inserted":"Employee Inserted successfully";
    }
    
}
