package com.example19.onetomany_manytoone.daos;

import com.example19.onetomany_manytoone.entities.Department;

public interface IEmpDepartDao 
{
    public String insertEmp(Department dep);
    public void fetchEmp(int eno);
}
