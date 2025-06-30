package com.example12.resultSetExtractordemo.daos;

import java.util.List;

import com.example12.resultSetExtractordemo.model.Employees;

public interface IEmployeeDAO 
{
    public List<Employees> getEmpDetailsBydesgn(String d1,String d2);
}
