package com.example19.entities;

import java.math.BigInteger;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cust_id;
    private String cust_name;
    private BigInteger phn_num;
    @Embedded
    private CustAddress address;

    public Customers() {
    }

    public Customers(CustAddress address, int cust_id, String cust_name, BigInteger phn_num) 
    {
        this.address = address;
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.phn_num = phn_num;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public BigInteger getPhn_num() {
        return phn_num;
    }

    public void setPhn_num(BigInteger phn_num) {
        this.phn_num = phn_num;
    }

    public CustAddress getAddress() {
        return address;
    }

    public void setAddress(CustAddress address) 
    {
        this.address = address;
    }

    @Override
    public String toString() 
    {
        return "Customers [cust_id=" + cust_id + ", cust_name=" + cust_name + ", phn_num=" + phn_num + ", address="
                + address + "]";
    }

   
    
    
    

}
