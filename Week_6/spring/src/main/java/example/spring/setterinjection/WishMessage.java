package example.spring.setterinjection;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmsg")
public class WishMessage 
{
    private LocalDateTime dateTime;
    @Autowired
    public void setDateTime(LocalDateTime dateTime) 
    {
        this.dateTime = dateTime;
    }
    public String generateMessage(String user)
    {
        int h=dateTime.getHour();
        if(h<12)
        {
            return "Good Moring "+user;
        }
        else if(h<16)
        {
            return "Good Afternoon "+user;
        }
        else if(h<20)
        {
            return "Good Evening "+user;
        }
        else
        {
            return "Good Night "+user;
        }
    }
    
 
}
