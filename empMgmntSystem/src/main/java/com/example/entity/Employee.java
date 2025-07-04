package com.example.entity;
import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee 
{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String department;
	    private Double salary;
	    
		public Employee() 
		{
			super();
		}
		public Employee(Long id, String name, String email, String department, Double salary) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.department = department;
			this.salary = salary;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
	    

}

	

	

	   
	   


