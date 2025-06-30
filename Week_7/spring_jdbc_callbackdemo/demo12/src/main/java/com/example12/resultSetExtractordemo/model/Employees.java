package com.example12.resultSetExtractordemo.model;

public class Employees 
{
    private int emp_id;
    private String emp_name;
    private String job;
    private int salary;
    public int getEmp_id() 
    {
        return emp_id;
    }
    public void setEmp_id(int emp_id) 
    {
        this.emp_id = emp_id;
    }
    public String getEmp_name() 
    {
        return emp_name;
    }
    public void setEmp_name(String emp_name) 
    {
        this.emp_name = emp_name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() 
    {
        return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", job=" + job + ", salary=" + salary + "]";
    }
    



}
