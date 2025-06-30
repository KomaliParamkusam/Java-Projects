package com.example19.many_to_many.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject 
{
    private int sub_id;
    @Id
    private String sub_name;

    @ManyToMany(mappedBy = "subjects",cascade=CascadeType.ALL)
    private List<Teacher> teachers;

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Subject [sub_id=" + sub_id + ", sub_name=" + sub_name + ", teachers=" + teachers + "]";
    }

}
