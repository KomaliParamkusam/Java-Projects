package Week_4.BehavioralPatterns.strategy;

public class StrategyPatternExample 
{
    public static void main(String[] args) 
    {
        Traveler journey=new Traveler();
        journey.setTraveling(new CarTravel());
        journey.startJourney("Hyderabad", "Banglore");
        journey.setTraveling(new PublicTransport() );
        journey.startJourney("Khammam", "Tirupati");
    }

    
}
