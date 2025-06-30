package com.example2.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
@Primary
public class PetrolEngine implements Engine
{
    
    @Override
    public String type() 
    {
        return "Petrol Engine";
    }
    
}
