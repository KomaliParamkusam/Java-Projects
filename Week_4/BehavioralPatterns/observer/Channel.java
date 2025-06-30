package Week_4.BehavioralPatterns.observer;


import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject
{
    public String title;
    List<Subscriber> subs=new ArrayList<>();
    @Override
    public void subscribe(Observer o) 
    {
        subs.add((Subscriber) o);
    }

    @Override
    public void unsubscribe(Observer o) 
    {
       subs.remove(o);
    }

    @Override
    public void setTitle(String title) 
    {
       this.title=title;
       notifySubcribers();
    }

    @Override
    public void notifySubcribers() 
    {
        for(Subscriber s:subs)
        {
            s.upload();
        }
    }
    
}
