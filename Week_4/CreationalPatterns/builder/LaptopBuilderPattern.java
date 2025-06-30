package builder;

public class LaptopBuilderPattern 
{
    public static void main(String[] args) 
    {
        Laptop officeLaptop=new LaptopBuilder().setOperatingSystem("Windows").setProcessor("intel i7").setRam(16).setStorage("256 GB").build();
        System.out.println("Features for Office laptop: "+officeLaptop);
        System.out.println("-------------------");
        Laptop personalLaptop=new LaptopBuilder().setOperatingSystem("macOS").setProcessor("Apple Silicon").build();
        System.out.println("Features for Personal Laptop: "+personalLaptop);
    }
}
