package com.example18.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int product_id;
    private String p_name;
    private String p_category;
    private double p_price;
    private int stock;
   
    @Lob
    @Column(name="pro_image")
    private byte[] image;
    public Products()
    {
        
    }
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
    public String getP_category() {
        return p_category;
    }
    public void setP_category(String p_category) {
        this.p_category = p_category;
    }
    public double getP_price() {
        return p_price;
    }
    public void setP_price(double p_price) {
        this.p_price = p_price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    @Override
    public String toString() 
    {
        return "Products [product_id=" + product_id + ", p_name=" + p_name + ", p_category=" + p_category + ", p_price="
                + p_price + ", stock=" + stock + ", image=" + Arrays.toString(image) + "]";
    }
    
  
    

}
