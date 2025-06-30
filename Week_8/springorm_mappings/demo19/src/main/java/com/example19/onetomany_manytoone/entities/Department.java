package com.example19.onetomany_manytoone.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int depart_id;
    private String depart_name;
    
    @OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Employee> employees;

    

    public Department() {
    }

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department [depart_id=" + depart_id + ", depart_name=" + depart_name + ", employees=" + employees + "]";
    }


}
