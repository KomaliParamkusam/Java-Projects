package builder;

public class LaptopBuilder 
{
    private String processor;
    private int ram;
    private String storage;
    private String operatingSystem;

    public LaptopBuilder setProcessor(String processor) 
    {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setRam(int ram) 
    {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setStorage(String storage) 
    {
        this.storage = storage;
        return this;
    }

    public LaptopBuilder setOperatingSystem(String operatingSystem) 
    {
        this.operatingSystem = operatingSystem;
        return this;
    }
    public Laptop build()
    {
        return new Laptop(operatingSystem, processor, ram, storage);
    }


}
