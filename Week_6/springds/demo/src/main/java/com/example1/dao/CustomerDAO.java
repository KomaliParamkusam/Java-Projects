package com.example1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example1.model.Customer;
@Repository("custDAO")
public class CustomerDAO //implements ICustomerDAO
{
    private static final String query = "INSERT INTO spring_cust_info (custno, cname, cadd, bill, discount, finalamount) VALUES (cno_seq.NEXTVAL, ?, ?, ?, ?, ?)";
;
    @Autowired
    private DataSource ds;

   // @Override
    public int insert(Customer cust) throws Exception
    {
        int count=0;
        try(Connection con=ds.getConnection();
        PreparedStatement ps=con.prepareStatement(query))
        {
                ps.setString(1, cust.getCname());
                ps.setString(2,cust.getCaddrs());
                ps.setDouble(3,cust.getBill());
                ps.setDouble(4,cust.getDiscount());
                ps.setDouble(5, cust.getFinal_amount());
                count=ps.executeUpdate();
        } 
        catch(SQLException se)
        {
          se.printStackTrace();
          throw se;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return count;
    }
    
}
