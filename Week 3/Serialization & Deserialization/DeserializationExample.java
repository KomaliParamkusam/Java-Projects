import java.io.*;
import java.util.*;
public class DeserializationExample
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fin=new FileInputStream("teacher.ser");
            ObjectInputStream oin=new ObjectInputStream(fin);
            List<Teacher> Dlist=(List<Teacher>)oin.readObject();
            for(Teacher l:Dlist)
            {
                   l.display();
            }
            fin.close();
            oin.close();
        }
        catch(Exception e)
        {

        }
    }
}