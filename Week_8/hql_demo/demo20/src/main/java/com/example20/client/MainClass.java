package com.example20.client;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainClass {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
    //     Student s1=new Student();
    //     s1.setSname("Amala");
    //     Student s2=new Student();
    //     s2.setSname("Vironika");
    //     // Student s3=new Student();
    //     // s3.setSname("Triniti");
    //     List<Student> students1=new ArrayList<>();
    //     students1.add(s1);
    //     students1.add(s2);
    //     // List<Student> students2=new ArrayList<>();
    //     // students2.add(s3);
    //     Course course1=new Course();
    //     course1.setCid(101);
    //     course1.setCname("Java Full Stack");
    //     course1.setDuration("10 months");
    //     course1.setStudents(students1);
    //     // Course course2=new Course();
    //     // course2.setCid(102);
    //     // course2.setCname("Spring Boot");
    //     // course2.setDuration("6 months");
    //     // course2.setStudents(students2);
    //     s1.setCourse(course1);
    //     s2.setCourse(course1);
    //     // s3.setCourse(course2);
    //     session.save(s1);
    //     session.save(s2);
    //     // session.save(s3);
    //    // session.save(course1);
    //     // session.save(course2);
    //     tx.commit();
                    //SELECT QUERY USING WHERE CLAUSE
        // Student student = session.createQuery("from Student where sid=:x", Student.class).setParameter("x",2).uniqueResult();
        // // l.forEach((student) -> {
        //    System.out.println(student.getSid() + " :: " + student.getSname() + " :: " + student.getCourse().getCname()
        //          + " :: " + student.getCourse().getCid() + " :: " + student.getCourse().getDuration());

        // });
                                            //DELETE HQL QUERY
        // session.createQuery("delete from Student where sname=:name").setParameter("name", "Amala").executeUpdate();
                                            //UPDATE HQL QUERY
        //        session.createQuery("update Student set sname=:name where sname=:x").setParameter("name", "Deepika").setParameter("x", "Vironika").executeUpdate();
        // tx.commit();

                                            //JOIN HQL QUERY

        Query<Object[]> q=session.createQuery("select c.cname,c.duration,s.sname from Course as c INNER JOIN c.students as s");
        List<Object[]> l=q.getResultList();
        for(Object[] a:l)
        {
            System.out.println(Arrays.toString(a));
        }

        // System.out.println("Updated Successfully");
        session.close();
        factory.close();

    }
}
