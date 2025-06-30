package example.propertiestest;

public class DTDC implements Courier
{

    public DTDC() 
    {
        System.out.println("DTDC Const");
    }

    @Override
    public String deliver(int oid) 
    {
        return "Order-Id: "+oid+" is delivered using DTDC";
    }
    
}

