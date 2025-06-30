package com.example19.client;

import java.math.BigInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example19.entities.CustAddress;
import com.example19.entities.Customers;

public class MainClass 
{
    public static void main(String[] args) 
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Customers customer=new Customers();
        customer.setCust_name("roopa");
        customer.setPhn_num(new BigInteger("7899032230"));
        CustAddress address=new CustAddress();
        address.setStreet("Jalagam Nagar");
        address.setCity("Khammam");
        address.setState("Telangana");
        address.setZip_code(507303);
        address.setCountry("India");
        customer.setAddress(address);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(customer);
       System.out.println("Inserted Successfully");
        // Customers customer=session.get(Customers.class, 2);
        // session.delete(customer);
        // System.out.println("Deleted Successfully.....");
        tx.commit();
        factory.close();
        session.close();

    }
}
