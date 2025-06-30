package com.example19.many_to_many.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher 
{
    private Integer teacher_id;
    @Id
    private String teacher_name;

    @ManyToMany(cascade=CascadeType.ALL)

    @JoinTable(
        name = "teacher_subject",
        joinColumns = @JoinColumn(name = "teacher_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

   

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", subjects=" + subjects + "]";
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    
    
    
}
