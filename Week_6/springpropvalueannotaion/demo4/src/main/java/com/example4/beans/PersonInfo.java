package com.example4.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("perInfo")
//@Scope("singleton")
public class PersonInfo 
{ 
    //value injecting from properties file
    @Value("${per.name:true id}")
    private String name;
    @Value("${per.age}")
    private Integer age;
    @Value("${per.adrss}")
    private String address;

    //direct value injecting
    @Value("500076")
    private long pincode;

    //injecting system property values
    @Value("${os.name}")
    private String osName;
    @Value("${os.version}")
    private Double osVersion;

     //injecting environment variables
    @Value("${Path}")
    private String pathData;
    
     @Override
    public String toString() 
    {
        return "PersonInfo [name=" + name + ", age=" + age + ", address=" + address + ", pincode=" + pincode
                + ", osName=" + osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
    }
    
}
