package pack2;
import java.io.*;
import java.util.*;
public class User implements Serializable
{
    private String Uname;
    private String Gender;
    private int Uage;
    boolean isEligible;
    public User(){}
    public User(String Gender, int Uage, String Uname) 
    {
        this.Gender = Gender;
        this.Uage = Uage;
        this.Uname = Uname;
    }
    public void display()
    {
        System.out.println("Name: "+Uname+" Gender: "+Gender+" Age: "+Uage+" Vote Eligibility: "+isEligible);
    }
    public void checkEligibility() 
    {
        isEligible = Uage >= 18;
    }
    public void Serialization(List<User> UList) throws FileNotFoundException,IOException
    {
        
        FileOutputStream fout=new FileOutputStream("User.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(UList);
        System.out.println("Successfully Serialized");
        fout.close();
        out.close(); 
       
    }
    public List<User> Deserialization() throws FileNotFoundException,IOException, ClassNotFoundException
    {
        
            FileInputStream fin=new FileInputStream("User.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            List<User> Dlist=(List<User>)oin.readObject();
            System.out.println("Successfully Deserialized");
            fin.close();
            oin.close();
            return Dlist;
    }
    
    public String getUname() 
    {
        return Uname;
    }

}
