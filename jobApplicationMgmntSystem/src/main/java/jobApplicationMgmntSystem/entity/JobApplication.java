package jobApplicationMgmntSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "jobApplication")
public class JobApplication {
	@Id
	private int id;
	private String firstName;
	private String email;
	private String position;
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getPosition() {
		return position;
	}
 
	public void setPosition(String position) {
		this.position = position;
	}
 
	@Override
	public String toString() {
		return "JobApplication [Id=" + id + ", FirstName=" + firstName + ", Email=" + email + ", Position=" + position
				+ "]";
	}
 
}