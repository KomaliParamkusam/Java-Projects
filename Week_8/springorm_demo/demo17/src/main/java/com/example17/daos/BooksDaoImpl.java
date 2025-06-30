package com.example17.daos;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example17.entity.Books;

public class BooksDaoImpl implements IBooksDao
{
    
    private HibernateTemplate hibernateTemplate;

    @Transactional
    @Override
    public int insert(Books b) 
    {
        Integer i=(Integer)hibernateTemplate.save(b);
        return i;
    }

    public Books getOneBookDetails(int bid)
    {
        return hibernateTemplate.get(Books.class,bid);
    }
     
    public List<Books> getAllBooks()
    {
        List<Books> l=hibernateTemplate.loadAll(Books.class);
        return l;
    }
     
    @Transactional
    public void updateBook(Books b)
    {
        hibernateTemplate.update(b);
    }

    @Transactional 
    public void deleteBook(int bid)
    {
        Books b=hibernateTemplate.get(Books.class, bid);
        hibernateTemplate.delete(b);
    }

    
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    
}
