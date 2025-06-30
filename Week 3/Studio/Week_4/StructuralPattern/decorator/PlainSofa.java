package decorator;

public class PlainSofa implements Sofa
{

    @Override
    public double getPrice() 
    {
        return 25000.0;
    }

    @Override
    public String getDescription() 
    {
        return "Plain Sofa";
    }
    
}
