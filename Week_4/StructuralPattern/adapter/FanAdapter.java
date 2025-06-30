

public class FanAdapter implements SmartDevice
{
    private OldFan fan;
    @Override
    public void turnOn() 
    {
        fan=new OldFan();
        fan.startFan();
    }
    
}
