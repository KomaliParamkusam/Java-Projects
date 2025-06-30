package com.example15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example15.daos.IUserDAO;

@Service("userService")
public class UserServiceImpl implements IUserService
{
    @Autowired
    private IUserDAO dao;
    @Override
    public String loginuser(String uname, String pswrd) 
    {
        return dao.authentication(uname, pswrd);
    }
    
}
