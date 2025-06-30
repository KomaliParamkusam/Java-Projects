package proxy;

public class ProxyDoor implements Door
{
    private final String password="Security@11";
    private String pswrd;
    private RealDoor door;

    public ProxyDoor(String pswrd) 
    {
        this.pswrd = pswrd;
    }
     
    @Override
    public void open() 
    {
        if(authenticate(pswrd))
        {
            door=new RealDoor();
            door.open();
        }
        else
        {
            System.out.println("Access Denied");
        }
    }
    public boolean authenticate(String str)
    {
        if(str.equals(password))
        {
            return true;
        }
        return false;
    }
    
}
