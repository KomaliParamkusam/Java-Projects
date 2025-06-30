package com.example16.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO
{
    private static final String EMP_NAME_BYID="SELECT FIRST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
    private DataSource ds;
    private EmployeeSelector selector;
    @Autowired
    public EmployeeDAOImpl(DataSource ds) 
    {
        this.ds = ds;
        selector=new EmployeeSelector(ds, EMP_NAME_BYID);
        
    }
    @Override
    public String getEmpById(int eno) 
    {
        String name=selector.findObject(eno);
        return name;
    }
    private static class EmployeeSelector extends MappingSqlQuery<String>
    {
        public EmployeeSelector(DataSource ds, String sql) 
        {
            super(ds,sql);
            super.declareParameter(new SqlParameter(Types.INTEGER));
            super.compile();
        }


        @Override
        public String mapRow(ResultSet rs, int rowNum) throws SQLException 
        {
           String name=rs.getString(1);
           return name;
        }

    }
    
}
