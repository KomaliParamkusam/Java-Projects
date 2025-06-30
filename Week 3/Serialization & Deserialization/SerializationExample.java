import java.io.*;
import java.util.*;
class Teacher implements Serializable
{
    //private static final long serialVersionUID = 1L; 
    private String Tname;
    private int TId;
    private String TSub;
    transient String password;

    public Teacher(int TId, String TSub, String Tname) 
    {
        this.TId = TId;
        this.TSub = TSub;
        this.Tname = Tname;
        this.password="123456789";
    }
    public void display()
    {
        System.out.println(" Name: "+Tname+" ID: "+TId+" Subject: "+TSub+" Password: "+password);
    }
}
public class SerializationExample
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        List<Teacher> TList=new ArrayList<>();
        TList.add(new Teacher(506,"Java","Geetanjali"));
        TList.add(new Teacher(578,"Python","Lilly"));
        FileOutputStream fout=new FileOutputStream("teacher.ser");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(TList);
        System.out.println("Successfully Serialized");
        fout.close();
        out.close();        
    }
}