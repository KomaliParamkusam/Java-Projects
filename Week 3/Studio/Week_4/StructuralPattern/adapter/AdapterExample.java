

public class AdapterExample 
{
    public static void main(String[] args) 
    {
        SmartDevice fan=new FanAdapter();
        SmartDevice light=new LightAdapter();
        fan.turnOn();
        light.turnOn(); 
    }
}
