package Week_4.BehavioralPatterns.strategy;

public class BikeTravel implements TravelStrategy
{

    @Override
    public void travel(String source, String destination) 
    {
        System.out.println("Travelling by bike from "+source+" to "+destination);
    }
    
}
