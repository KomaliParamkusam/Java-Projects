package decorator;

public abstract class SofaDecorator implements Sofa
{
    protected Sofa sofa;
    public SofaDecorator(Sofa s) 
    {
        this.sofa=s;
    }
    @Override
    public double getPrice()
    {
        return sofa.getPrice();
    }
    @Override
    public String getDescription()
    {
        return sofa.getDescription();
    }
    
}
