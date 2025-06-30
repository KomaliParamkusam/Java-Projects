package proxy;

public class ProxyExample 
{
    public static void main(String[] args) 
    {
        Door door=new ProxyDoor("Security@11");
        door.open();
    }
}
