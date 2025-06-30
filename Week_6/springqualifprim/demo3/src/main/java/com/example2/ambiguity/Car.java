package com.example2.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("car")
public class Car 
{
    @Autowired
    @Qualifier("de")
    private Engine engine;
    public void start()
    {
      System.out.println("Car is running with "+engine.type());
    }
}
