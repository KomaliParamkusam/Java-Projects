package com.example11.client;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example11.service.CountriesServiceimp;
import com.example11.service.ICountriesService;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/example11/cfgs/applicationContext.xml");
       
            ICountriesService ser=ctx.getBean("countser",CountriesServiceimp.class);
            try
            {
            System.out.println("Countries Count:: " + ser.fetchCount());
            System.out.println("Country name:: "+ser.fetchName("ZW"));
            System.out.println("Country Details:: "+ser.fetchDetailsById("US"));
            List<Map<String,Object>> l=ser.fetchCountries();
            l.forEach( map-> 
                        {
                            System.out.println(map);
                        });
          
        }
        catch(Exception dae)
        {
            dae.printStackTrace();
        }
    }
}
