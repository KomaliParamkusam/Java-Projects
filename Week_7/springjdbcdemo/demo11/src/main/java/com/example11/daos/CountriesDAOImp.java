package com.example11.daos;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class CountriesDAOImp implements ICountriesDAO
{
    private static final String COUNT_COUNTRY="SELECT COUNT(*) FROM COUNTRIES";
    private static final String COUNTRY_NAME="SELECT COUNTRY_NAME FROM COUNTRIES WHERE COUNTRY_ID=?";
    private static final String COUNTRY_DETAILS="SELECT *FROM COUNTRIES WHERE COUNTRY_ID=?";
    private static final String COUNTRIES="SELECT *FROM COUNTRIES";
    private JdbcTemplate jt;

    public CountriesDAOImp(JdbcTemplate jt) 
    {
        this.jt = jt;
    }

    @Override
    public int getCountriesCount() 
    {
        int count=jt.queryForObject(COUNT_COUNTRY, Integer.class);
        return count;
    }

    @Override
    public String getCountById(String id) 
    {
       String name=jt.queryForObject(COUNTRY_NAME, String.class,id);
       return name;
    }

    @Override
    public Map<String, Object> getCountryDetailsById(String id) 
    {
        Map<String,Object> map=jt.queryForMap(COUNTRY_DETAILS, id);
        return map;
    }

    @Override
    public List<Map<String, Object>> getDetails() 
    {
        List<Map<String,Object>> l=jt.queryForList(COUNTRIES);
        return l;
    }
    

}
