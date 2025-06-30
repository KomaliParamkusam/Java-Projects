package example.propertiestest;

public class DHL implements Courier
{

    public DHL() 
    {
        System.out.println("DHL Constructor");
    }

    @Override
    public String deliver(int oid) 
    {
        return "Order-Id: "+oid+" is delivered using DHL";
    }
    
}
