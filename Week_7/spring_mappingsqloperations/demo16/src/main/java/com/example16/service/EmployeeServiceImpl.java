package com.example16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example16.daos.IEmployeeDAO;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private IEmployeeDAO dao;

    @Override
    public String fetchEmpName(int eno) 
    {
        return dao.getEmpById(eno);
    }
    
}
