package com.example12.resultSetExtractordemo.service;

import java.util.List;

import com.example12.resultSetExtractordemo.model.Employees;

public interface IEmployeeService 
{
    public List<Employees> fetchEmpdetailsByDesign(String d1,String d2);
}
