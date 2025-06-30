package com.example14.daos;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example14.model.Student;
@Repository("studDao")
public class StudentDaoImpl implements IStudentdao
{

     @Autowired
    private SimpleJdbcInsert sji;
    @Override
    public int insertStudent(Student stud) 
    {
        sji.setTableName("student");
        Map<String,Object> map=Map.of("SID", stud.getSid(),"SNAME",stud.getSname(),"GRADE",stud.getGrade(),"MARKS",stud.getMarks());
        int c=sji.execute(map);
        return c;
    }
    
}
