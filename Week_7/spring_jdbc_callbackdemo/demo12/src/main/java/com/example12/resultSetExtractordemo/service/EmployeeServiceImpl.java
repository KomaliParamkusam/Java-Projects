package com.example12.resultSetExtractordemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example12.resultSetExtractordemo.daos.IEmployeeDAO;
import com.example12.resultSetExtractordemo.model.Employees;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private IEmployeeDAO dao;

    @Override
    public List<Employees> fetchEmpdetailsByDesign(String d1, String d2) 
    {
       List<Employees> emplist=dao.getEmpDetailsBydesgn(d1, d2);
       return emplist;
    }
    
}
