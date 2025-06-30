package example.spring.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("company")
public class Company 
{
    
    private Address address;
    @Autowired
    public void setAddress(Address address) 
    {
        this.address = address;
    }
    public void dispalyAddress(String name)
    {
       
        System.out.println(name);
        System.out.println(address);
    }


   
}
