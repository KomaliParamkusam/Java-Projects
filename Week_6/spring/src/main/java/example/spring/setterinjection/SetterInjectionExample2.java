package example.spring.setterinjection;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterInjectionExample2 
{
    public static void main(String[] args)
    {
        FileSystemXmlApplicationContext c=new FileSystemXmlApplicationContext("src/main/resources/address.xml");
        Object obj=c.getBean("company");
        Company com=(Company)obj;
        com.dispalyAddress("TrueId");
        c.close();
    }
}
