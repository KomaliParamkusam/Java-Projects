package com.example11.service;

import java.util.List;
import java.util.Map;

import com.example11.daos.ICountriesDAO;

public class CountriesServiceimp implements ICountriesService
{
    private ICountriesDAO dao;

    public CountriesServiceimp(ICountriesDAO dao) 
    {
        this.dao = dao;
    }

    @Override
    public int fetchCount() 
    {
       int c=dao.getCountriesCount();
       return c;
    }

    @Override
    public String fetchName(String id) 
    {
        String name=dao.getCountById(id);
        return name;
    }

    @Override
    public Map<String, Object> fetchDetailsById(String id) 
    {
        Map<String,Object> m=dao.getCountryDetailsById(id);
        return m;
    }

    @Override
    public List<Map<String, Object>> fetchCountries() 
    {
        List<Map<String,Object>> l=dao.getDetails();
        return l;
    }
    
}
