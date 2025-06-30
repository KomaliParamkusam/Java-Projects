package example.propertiestest;

public class StrategyFactoryPropertiesTest 
{
    public static void main(String[] args) 
    {
        Flipkart flip=FlipkartFactory.getInstance();
        String result=flip.shopping(new String[]{"Lehenga,Saree,Sharara"}, new double[]{10000,45600,74000});
        System.out.println(result);
    }
}