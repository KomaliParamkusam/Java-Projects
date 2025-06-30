package com.example13.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example13.model.EmpDetails;
import com.example13.model.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDAO
{ 
    private static final String EMP_NAME_BYID="SELECT FIRST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID=:id";
    private static final String EMP_DETAILS_BYDESIGN="SELECT E.EMPLOYEE_ID,E.FIRST_NAME,J.JOB_ID,J.JOB_TITLE,E.SALARY FROM EMPLOYEES E INNER JOIN JOBS J ON E.JOB_ID=J.JOB_ID WHERE J.JOB_TITLE IN (:d1,:d2,:d3)";
   private static final String INSERT_EMP="INSERT INTO EMPDETAILS (EMPID,EMPNAME,SALARY,EMAIL) " +
        "VALUES (:empid, :empname,:esal, :email)";
    @Autowired
    private NamedParameterJdbcTemplate npjt;
  

    //using map object 
    @Override
    public String getEmpNameById(int eno) 
    {
      Map<String,Object> paramMap=Map.of("id",eno);
      String name=npjt.queryForObject(EMP_NAME_BYID, paramMap, String.class);
      return name;
    }


    //using sqlparamtersource
    @Override
    public List<Employee> getEmpByDesign(String des1, String des2, String des3) 
    {
        MapSqlParameterSource source=new MapSqlParameterSource();
        source.addValue("d1", des1);
        source.addValue("d2", des2);
        source.addValue("d3", des3);
        List<Employee> l=npjt.query(EMP_DETAILS_BYDESIGN, source, rs->
                                {
                                List<Employee> li=new ArrayList<>();
                                while(rs.next())
                                {
                                Employee emp=new Employee();
                                emp.setEid(rs.getInt(1));
                                emp.setEname(rs.getString(2));
                                emp.setJob_id(rs.getString(3));
                                emp.setJob(rs.getString(4));
                                emp.setSalary(rs.getInt(5));
                                li.add(emp);

                                }
                                return li;
                            });
                                
                                
        return l;
    }

    @Override
    public int insertEmployee(EmpDetails emp) 
    {
        
   
        BeanPropertySqlParameterSource beanp=new BeanPropertySqlParameterSource(emp);
        int c=npjt.update(INSERT_EMP, beanp);
         return c;
    }
    
}
