package com.example12.rowMapperdemo.model;

public class Locations 
{
    private int loc_id;
    private String street_address;
    private String postal_code;
    private String city;
    public int getLoc_id() {
        return loc_id;
    }
    public void setLoc_id(int loc_id) {
        this.loc_id = loc_id;
    }
    public String getStreet_address() {
        return street_address;
    }
    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }
    public String getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() 
    {
        System.out.println("------------------------------------------------------------------------------------");
        return "Locations [loc_id=" + loc_id + ", street_address=" + street_address + ", postal_code=" + postal_code
                + ", city=" + city + "]";
    }
    
}
