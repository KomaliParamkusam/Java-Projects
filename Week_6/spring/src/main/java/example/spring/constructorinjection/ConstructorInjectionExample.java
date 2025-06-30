package example.spring.constructorinjection;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConstructorInjectionExample 
{
    public static void main(String[] args) 
    {
        FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("src/main/resources/orders.xml");
        Orders o=(Orders)context.getBean("order");
        o.displayOrderDetails();
        context.close();
    }
}
