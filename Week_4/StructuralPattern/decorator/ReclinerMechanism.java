package decorator;

public class ReclinerMechanism extends SofaDecorator
{
    public ReclinerMechanism(Sofa sofa)
    {
        super(sofa);
    }
    public double getPrice()
    {
        return sofa.getPrice()+10000.0;
    }
    public String getDescription()
    {
        return sofa.getDescription()+"and with comforatable Recliner Mechanism ";
    }
}
