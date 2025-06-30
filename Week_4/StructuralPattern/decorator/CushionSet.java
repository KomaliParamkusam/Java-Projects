package decorator;

public class CushionSet extends SofaDecorator
{
    public CushionSet(Sofa sofa)
    {
        super(sofa);
    }
    public double getPrice()
    {
        return sofa.getPrice()+2500.0;
    }
    public String getDescription()
    {
        return sofa.getDescription()+",cushions ";
    }
}
