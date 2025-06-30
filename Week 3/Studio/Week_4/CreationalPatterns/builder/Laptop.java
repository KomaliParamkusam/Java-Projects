package builder;

public class Laptop 
{
    private String processor;
    private int ram;
    private String storage;
    private String operatingSystem;

    public  Laptop(String operatingSystem, String processor, int ram, String storage) 
    {
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() 
    {
        return "Laptop [processor=" + processor + ", ram=" + ram + ", storage=" + storage + ", operatingSystem="
                + operatingSystem + "]";
    }
    
    
    
}
