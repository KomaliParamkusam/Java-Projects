package com.example11.daos;

import java.util.List;
import java.util.Map;

public interface ICountriesDAO 
{
    public int getCountriesCount();
    public String getCountById(String id);
    public Map<String,Object> getCountryDetailsById(String id);
    public List<Map<String,Object>> getDetails();
}
