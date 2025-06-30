package example.propertiestest;
public class Bluedart implements Courier
{

    public Bluedart() 
    {
        System.out.println("Bluedart Constructor");
    }

    @Override
    public String deliver(int oid) 
    {
        return "Order-Id: "+oid+" is delivered using Bluedart";
    }
    
}

