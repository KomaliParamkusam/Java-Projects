package Week_4.BehavioralPatterns.strategy;

public class PublicTransport implements TravelStrategy
{

    @Override
    public void travel(String source, String destination) 
    {
        System.out.println("Travelling through public transport from "+source+" to "+destination);
    }
    
}
