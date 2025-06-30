package com.example19.many_to_many.daos;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.example19.many_to_many.entities.Subject;
import com.example19.many_to_many.entities.Teacher;


public class SchoolDaoImpl 
{
    private HibernateTemplate ht;

    // @Override
    @Transactional
    public String insertTeacher(List<Teacher> teachers) 
    {
        int c=0;
       for (Teacher teacher : teachers)
        {
            ht.save(teacher);
            c++;
        }
        return c==0?"Teacher Not inserted":"Teacher Inserted successfully";
    }

    public void setHt(HibernateTemplate ht) 
    {
        this.ht = ht;
    }

    //@Override
    @Transactional
    public String insertSub(List<Subject> sub) 
    {
        int c=0;
         for (Subject subject : sub)
        {
            ht.save(subject);
            c++;
        }
       return c==0?"Subject Not inserted":"Subject Inserted successfully";
    }
    @Transactional
    public void insert(Subject s)
    {
        ht.save(s);

    }

    
}
