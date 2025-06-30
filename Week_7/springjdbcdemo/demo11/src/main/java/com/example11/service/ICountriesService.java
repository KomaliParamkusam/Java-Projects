package com.example11.service;

import java.util.List;
import java.util.Map;


public interface ICountriesService
 {
    public int fetchCount();
    public String fetchName(String id);
    public Map<String,Object> fetchDetailsById(String id);
    public List<Map<String,Object>> fetchCountries();
}
