

public class LightAdapter implements SmartDevice
{
    private Tubelight light; 
    @Override
    public void turnOn() 
    {
       light=new Tubelight();
       light.glow();
    }
    
}
