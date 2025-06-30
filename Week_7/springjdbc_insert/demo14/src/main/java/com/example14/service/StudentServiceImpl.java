package com.example14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example14.daos.IStudentdao;
import com.example14.model.Student;

@Service("stuService")
public class StudentServiceImpl implements IStudentService
 {
    @Autowired
    private IStudentdao dao;

    @Override
    public String fetchRegisteredStud(Student s) 
    {
        int c=dao.insertStudent(s);
        return c==0?"Student Not Registered":"Student Inserted Successfully";
    }
    
}
