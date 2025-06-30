package com.example1.model;

public class Customer 
{
    private int cno;
    private String cname;
    private String caddrs;
    private Double bill;
    private Double discount;
    private Double final_amount;
    public int getCno() {
        return cno;
    }
    public void setCno(int cno) {
        this.cno = cno;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCaddrs() {
        return caddrs;
    }
    public void setCaddrs(String caddrs) {
        this.caddrs = caddrs;
    }
    public Double getBill() {
        return bill;
    }
    public void setBill(Double bill) {
        this.bill = bill;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Double getFinal_amount() {
        return final_amount;
    }
    public void setFinal_amount(Double final_amount) {
        this.final_amount = final_amount;
    }
    
}
