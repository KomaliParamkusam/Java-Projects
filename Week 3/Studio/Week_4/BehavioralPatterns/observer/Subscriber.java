package Week_4.BehavioralPatterns.observer;

public class Subscriber implements Observer
{
    private String name;
    private Channel channel=new Channel();
    public Subscriber(String name) 
    {
        this.name = name;
    }
   
    @Override
    public void upload() 
    {
        System.out.println("Hellow!... "+name+" new video Uploaded: "+channel.title);
    }
    @Override
    public void suscribeChannel(Channel sub)
    {
       channel=sub;
    }
    
    
    
}
