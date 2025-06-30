package com.example21.entity;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="contacts")
public class Contact 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int contactId;
    private String firstName;
    private String lastName;
    private BigInteger phnNum;
    private String email;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(BigInteger phnNum) {
        this.phnNum = phnNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact{");
        sb.append("contactId=").append(contactId);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", phnNum=").append(phnNum);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
   
     
    

    
}
