package com.example12.rowMapperdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example12.rowMapperdemo.daos.ILocationDAO;
import com.example12.rowMapperdemo.model.Locations;

@Service("locService")
public class LocationServiceImp implements ILocationService
{
    @Autowired
    private ILocationDAO dao;
    
    @Override
    public Locations fetchLocationById(int lno) 
    {
        Locations l=dao.getLocationById(lno);
        return l;
    }
    
}
