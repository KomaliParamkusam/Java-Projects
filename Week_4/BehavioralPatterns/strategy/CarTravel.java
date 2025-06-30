package Week_4.BehavioralPatterns.strategy;

public class CarTravel implements TravelStrategy
{

    @Override
    public void travel(String source, String destination) 
    {
        System.out.println("Travelling in car from "+source+" to "+destination);
    }
    
}
