package Week_4.BehavioralPatterns.observer;

public class Youtube 
{
    public static void main(String[] args) 
    {
        Observer s1=new Subscriber("Komali");
        Observer s2=new Subscriber("Alia");
        Observer s3=new Subscriber("Aditya");
        Observer s4=new Subscriber("Karthik");
        Channel dreamLand=new Channel();
        dreamLand.subscribe(s1);
        dreamLand.subscribe(s2);
        dreamLand.subscribe(s3);
        dreamLand.subscribe(s4);
        dreamLand.unsubscribe(s4);
        s1.suscribeChannel(dreamLand);
        s2.suscribeChannel(dreamLand);
        s3.suscribeChannel(dreamLand);
        s4.suscribeChannel(dreamLand);
        dreamLand.setTitle("Oserver Design Pattern for Beginners");


    }
}
