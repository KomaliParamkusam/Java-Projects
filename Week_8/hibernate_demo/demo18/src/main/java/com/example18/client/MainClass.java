package com.example18.client;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example18.model.Products;

public class MainClass 
{
    public static void main(String[] args) throws IOException 
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Products product=new Products();
        product.setP_name("Cashhews");
        product.setP_category("Dry fruit");
        product.setP_price(70.0);
        product.setStock(80);
        session.save(product);
        System.out.println("--------------------------------");
        System.out.println("Successfully inserted:: "+product);
        System.out.println("--------------------------------");
        tx.commit(); 
        // Products p=session.get(Products.class, 3);
        // System.out.println("--------------------------------");
        // System.out.println(p);
        // System.out.println("--------------------------------");
        // Products pro=session.get(Products.class,1);
        // session.delete(pro);
        // System.out.println("---------Deleted Successfully---------");
        
        // FileInputStream fis=new FileInputStream("C:\\Users\\TrueID - 1020\\Downloads\\mariegold.jpg");
        // byte[] data=new byte[fis.available()];
        // fis.read(data);
        // Products pro=session.get(Products.class,2);
        // pro.setImage(data);
        // session.update(pro);
        // System.out.println("Updated Succefully");
        // System.out.println("-----------------------------------------------------------------------");

        List<Products> p=session.createQuery("from Products",Products.class).list();
        p.forEach(products -> 
        {
            System.out.println(products);
        });
        System.out.println("-----------------------------------------------------------------------");
       
        // fis.close();
        session.close();
        factory.close();
        
    }
}
