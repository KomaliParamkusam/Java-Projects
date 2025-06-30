package com.example2.ambiguity;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine
{
    
    @Override
    public String type() 
    {
        return "Diesel Engine";
    }
    
}
