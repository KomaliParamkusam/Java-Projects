package com.example19.many_to_many.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example19.many_to_many.daos.SchoolDaoImpl;
import com.example19.many_to_many.entities.Subject;
import com.example19.many_to_many.entities.Teacher;

public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/example19/many_to_many/cfgs/configure.xml");
        SchoolDaoImpl dao = ctx.getBean("dao", SchoolDaoImpl.class);

      
        Subject sub1 = new Subject();
        sub1.setSub_id(908);
        sub1.setSub_name("computer6");

        Subject sub2 = new Subject();
        sub2.setSub_id(1290);
        sub2.setSub_name("telugu7");

        Subject sub3 = new Subject();
        sub3.setSub_id(2560);
        sub3.setSub_name("physics7");

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(sub1);
        subjectList.add(sub2);
        subjectList.add(sub3);
        
        Teacher teacher1 = new Teacher();
        teacher1.setTeacher_id(3182);
        teacher1.setTeacher_name("Paramkusam");

        Teacher teacher2 = new Teacher();
        teacher2.setTeacher_id(2198);
        teacher2.setTeacher_name("Chitturi");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

       
        teacher1.setSubjects(subjectList); 
       //teacher2.setSubjects(List.of(sub2)); 

       
        sub1.setTeachers(List.of(teacher1));
        sub2.setTeachers(teacherList);
        sub3.setTeachers(List.of(teacher1));
        dao.insert(sub2);
      //System.out.println(dao.insertSub(subjectList)); 
        //System.out.println(dao.insertTeacher(teacherList));
    }
}
