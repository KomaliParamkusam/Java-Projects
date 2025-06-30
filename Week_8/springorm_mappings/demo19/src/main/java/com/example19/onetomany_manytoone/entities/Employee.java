package com.example19.onetomany_manytoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class Employee 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String emp_mail;

    @ManyToOne
    @JoinColumn(name="department")
    private Department department;

    public Employee() {
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() 
    {
        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_mail=" + emp_mail + "] ";
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    


}
