package decorator;

public class DecoratorPatternExample 
{
    public static void main(String[] args) 
    {
        Sofa mysofa=new PlainSofa();
       // System.out.println(mysofa.getDescription()+"\nTotal Cost "+mysofa.getPrice());
        mysofa=new LeatherCover(mysofa);
        mysofa=new CushionSet(mysofa);
        mysofa=new ReclinerMechanism(mysofa);
        System.out.println(mysofa.getDescription()+"\nTotal Cost "+mysofa.getPrice());
    }
}
