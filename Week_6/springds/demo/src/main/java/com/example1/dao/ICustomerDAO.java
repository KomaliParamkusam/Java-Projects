package com.example1.dao;

import com.example1.model.Customer;

public interface ICustomerDAO 
{
    int insert(Customer cust) throws Exception;
}
