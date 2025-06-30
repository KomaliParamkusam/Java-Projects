package example.spring.fieldinjection;

import org.springframework.stereotype.Component;

@Component
public class Books 
{
    private int bid;
    private String title;
    private String author;
    public Books(int bid, String title, String author) 
    {
        this.bid = bid;
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() 
    {
       
        return "| Books [Book Id:" + bid + " | Title: " + title + " | author: " + author + " ] | ";
    }

   

}
