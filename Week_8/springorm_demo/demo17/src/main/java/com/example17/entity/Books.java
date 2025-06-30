package com.example17.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bid;
     private String author;
    private String bname;
   
    private double price;
    
    public Books() 
    {
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Books(int bid, String author, String bname, double price) {
        this.bid = bid;
        this.author = author;
        this.bname = bname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books [bid=" + bid + ", author=" + author + ", bname=" + bname + ", price=" + price + "]";
    }
    
   


}
