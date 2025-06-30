package proxy;

public class ProxyExample 
{
    public static void main(String[] args) 
    {
        Door door=new ProxyDoor("Secu1");
        door.open();
    }
}
