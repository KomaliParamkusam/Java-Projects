package composite;
import java.util.*;
public class Folders implements FileSystem
{
    String name;
    List<FileSystem> files=new ArrayList<>();
    
    public Folders(String name) 
    {
        this.name = name;
    }
    public void addFiles(FileSystem f)
    {
        files.add(f);
    }
    @Override
    public void showStructure() 
    {
      System.out.println("Folder-->"+name+":");
      for(FileSystem f:files)
      {
        f.showStructure();
      }
    }
    
}
