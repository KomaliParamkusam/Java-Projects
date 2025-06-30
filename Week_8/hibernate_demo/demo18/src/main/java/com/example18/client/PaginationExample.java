package com.example18.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example18.model.Products;

public class PaginationExample 
{
    public static void main(String[] args) 
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory f=cfg.buildSessionFactory();
        Session s=f.openSession();
        List<Products> products = s
                .createQuery("from Products", Products.class)
                .setFirstResult(3)
                .setMaxResults(5)
                .getResultList();

        for (Products p : products) 
        {
            System.out.println(p);
        }
        s.close();
        f.close();

    }
}
