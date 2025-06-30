package com.example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.dao.CustomerDAO;
import com.example1.model.Customer;
@Service("custService")
public class CustomerMgntService implements ICustomerMgntService
{
    @Autowired
    private CustomerDAO custDAO;
    @Override
    public String registerCustomer(Customer cust) throws Exception 
    {
        double discountAmount=(cust.getBill()*(cust.getDiscount()/100.0));
        double finalamount=cust.getBill()-discountAmount;
        cust.setFinal_amount(finalamount);
        int c=custDAO.insert(cust);
        return c==0?"Customer Registration is failed ":"Customer Registered with and having bill amount:: "+cust.getBill()+" Discount:: "+discountAmount+" Total amount:: "+finalamount;

    }
    
}
