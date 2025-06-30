package decorator;

public class LeatherCover extends SofaDecorator
{
    public LeatherCover(Sofa sofa)
    {
        super(sofa);
    }
    public double getPrice()
    {
        return sofa.getPrice()+5000.0;
    }
    public String getDescription()
    {
        return sofa.getDescription()+" with LeatherCover";
    }
}
