package com.example19.onetomany_manytoone.daos;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.example19.onetomany_manytoone.entities.Department;
import com.example19.onetomany_manytoone.entities.Employee;

public class EmpDepartDaoImpl implements IEmpDepartDao 
{
    private HibernateTemplate ht;

    @Override
    @Transactional
    public String insertEmp(Department d) 
    {
        int c=(Integer)ht.save(d);
        return c==0?"Employee Not Inserted":"Employee inserted Successfully";
    }

   
    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }


    @Override
    @Transactional
    public void fetchEmp(int dno) 
    {
        Department dept=ht.get(Department.class,dno);
        // System.out.println("Department ID: " + dept.getDepart_id());
        // System.out.println("Department Name: " + dept.getDepart_name());
        System.out.println(dept);
// for (Employee e : dept.getEmployees()) {
//     System.out.println("Employee: " + e.getEmp_name() + ", " + e.getEmp_mail());
// }

       
    }
    
    
}
