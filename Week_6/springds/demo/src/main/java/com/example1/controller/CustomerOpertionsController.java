package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example1.model.Customer;
import com.example1.service.ICustomerMgntService;

@Controller("custController")
public class CustomerOpertionsController 
{
    @Autowired
    private ICustomerMgntService custService;
    public String processCustomer(Customer cust) throws Exception
    {
        String result=custService.registerCustomer(cust);
        return result;
    }
}
