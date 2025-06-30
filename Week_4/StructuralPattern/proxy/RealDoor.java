package proxy;

public class RealDoor implements Door
{

    @Override
    public void open() 
    {
       System.out.println("Door is Opened");
    }
    
}
