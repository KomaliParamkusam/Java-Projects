import java.io.*;
class FileExample
{
    public static void main(String[] args) throws IOException 
    {
        File f=new File("First.text");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
        System.out.println(f.isFile());
        f.mkdir();
       System.out.println(f.isDirectory()); 
       f.delete();
       System.out.println(f.isFile());
       System.out.println("-------------------------");
       File f1=new File("C:\\Studio");
       f1.createNewFile();
       String[] s=f1.list();
       for(String s1:s)
       {
        System.out.println(s1);
       }
        
    }
}