package example.spring.fieldinjection;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FiledInjectionExample 
{
    public static void main(String[] args) 
    {
        FileSystemXmlApplicationContext cont=new FileSystemXmlApplicationContext("src/main/resources/library.xml");
        Library lib=(Library)cont.getBean("library");
        lib.addBook();
    }
}
