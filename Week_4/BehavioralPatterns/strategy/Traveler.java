package Week_4.BehavioralPatterns.strategy;

public class Traveler 
{
    private TravelStrategy travel;
    public void setTraveling(TravelStrategy t)
    {
        this.travel=t;
    }
    public void startJourney(String source,String destination)
    {
        if(travel!=null)
        {
            travel.travel(source, destination);
        }
        else
        {
            System.out.println("No specific traveling type is selected");
        }
    }
}
