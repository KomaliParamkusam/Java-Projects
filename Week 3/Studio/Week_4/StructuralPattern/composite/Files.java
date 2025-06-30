package composite;

public class Files implements FileSystem
{
    String name;
    public Files(String name) 
    {
        this.name = name;
    }

    @Override
    public void showStructure() 
    {
        System.out.println("File Name: "+name);
    }
    
}
