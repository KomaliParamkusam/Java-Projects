package singleton;
class Singleton
{
    private static Singleton instance;
    private Singleton(){}
    public static synchronized Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
}
public class SingletonPatternDemo
{
    public static void main(String[] args) 
    {
        
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        if(obj1==obj2)
        {
            System.out.println("Only one object can be created");
        }
        else
        {
            System.out.println("Not a singleton pattern");
        }
    
    }
}