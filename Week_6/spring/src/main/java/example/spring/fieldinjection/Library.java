package example.spring.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;

//@Component("library")
public class Library 
{
    @Autowired
    private Books books;
    public void addBook()
    {
        System.out.println("Book Added Successfully  ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(books);
        System.out.println("------------------------------------------------------------------");
        
    }

}
