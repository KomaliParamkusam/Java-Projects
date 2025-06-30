package com.example12.resultSetExtractordemo.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example12.resultSetExtractordemo.model.Employees;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO
{
    private static final String EMP_DETAILS_DESIGNATION="SELECT E.EMPLOYEE_ID,E.FIRST_NAME,J.JOB_TITLE,E.SALARY FROM EMPLOYEES E INNER JOIN JOBS J ON E.JOB_ID=J.JOB_ID WHERE J.JOB_TITLE IN (?,?)";
    @Autowired
    private JdbcTemplate jt;
    @Override
    public List<Employees> getEmpDetailsBydesgn(String d1, String d2) 
    {
        List<Employees> emp=jt.query(EMP_DETAILS_DESIGNATION, 
                rs -> 
                {
                    List<Employees> e=new ArrayList<>();
                    while(rs.next())
                    {
                        Employees empl=new Employees();
                        empl.setEmp_id(rs.getInt(1));
                        empl.setEmp_name(rs.getString(2));
                        empl.setJob(rs.getString(3));
                        empl.setSalary(rs.getInt(4));
                        e.add(empl);

                    }
                    return e;
                }
        
        , 
        d1,d2);
        return emp;
    }
   
    
}
