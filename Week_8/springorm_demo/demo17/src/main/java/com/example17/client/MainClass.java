package com.example17.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example17.daos.IBooksDao;
import com.example17.entity.Books;


public class MainClass 
{
    public static void main(String[] args) 
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/example17/cfgs/config.xml");
        IBooksDao dao=ctx.getBean("dao",IBooksDao.class);
        Books b = new Books();
      
        // b.setBname("Vampire Diaries");
        // b.setAuthor("Herman");
        // b.setPrice(850.0);
        // System.out.println("Record Inserted succefuly: "+dao.insert(b));
    //    System.out.println("Book Details:: "+dao.getOneBookDetails(3));
    //     dao.getAllBooks().forEach((books) -> {
    //         System.out.println(books);
    //     });
       // dao.deleteBook(6);
        dao.getAllBooks().forEach((books) -> {
           System.out.println(books);
      });
      dao.updateBook(new Books(5, "Edward", "vampire diaries", 900.0) );
      dao.getAllBooks().forEach((books) -> {
           System.out.println(books);
      });

        
    }
    
}
