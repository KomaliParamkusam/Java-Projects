package abstractfactory;
interface TwoWheeler
{
    void create();
}
interface FourWheeler
{
    void create();
}
class HondaBike implements TwoWheeler
{
    public void create()
    {
        System.out.println("Honda bike is created");
    }
}
class TataBike implements TwoWheeler
{
    public void create()
    {
        System.out.println(("Tata Bike is created"));
    }
}
class Honda implements FourWheeler
{
    public void create()
    {
        System.out.println("Honda car is created");
    }
}
class Tata implements FourWheeler
{
    public void create()
    {
        System.out.println("Tata car is created");
    }
}
interface VehiclesFactory
{
    TwoWheeler createTwoWheeler();
    FourWheeler createFourWheeler();
}
class HondaFactory implements VehiclesFactory
{
    public TwoWheeler createTwoWheeler()
    {
        return new HondaBike();
    }   
    public FourWheeler createFourWheeler()
    {
        return new Honda();
    }
}
class TataFactory implements VehiclesFactory
{
    public TwoWheeler createTwoWheeler()
    {
        return new TataBike();
    }
    public FourWheeler createFourWheeler()
    {
        return new Tata();
    }
}
public class AbstractFactoryPattern 
{
    private TwoWheeler bike;
    private FourWheeler car;
    public AbstractFactoryPattern(VehiclesFactory vehicle)
    {
        bike=vehicle.createTwoWheeler();
        car=vehicle.createFourWheeler();
    }
    void displayVehicles()
    {
        bike.create();
        car.create();
    }
    public static void main(String[] args) 
    {
        AbstractFactoryPattern obj=new AbstractFactoryPattern(new HondaFactory() );
        obj.displayVehicles();
        obj=new AbstractFactoryPattern(new TataFactory());
        obj.displayVehicles();
    }
}
