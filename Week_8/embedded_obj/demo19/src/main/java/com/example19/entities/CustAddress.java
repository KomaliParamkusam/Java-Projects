package com.example19.entities;

import javax.persistence.Embeddable;

@Embeddable
public class CustAddress 
{
    
    private String street;
    private String city;
    private String state;
    private int zip_code;
    private String country;

    public CustAddress() 
    {
    }

    public CustAddress(String city, String country, String state, String street, int zip_code) 
    {
        this.city = city;
        this.country = country;
        this.state = state;
        this.street = street;
        this.zip_code = zip_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() 
    {
        return "CustAddress [street=" + street + ", city=" + city + ", state=" + state + ", zip_code=" + zip_code
                + ", country=" + country + "]";
    }
    
    
    
    
    
}
