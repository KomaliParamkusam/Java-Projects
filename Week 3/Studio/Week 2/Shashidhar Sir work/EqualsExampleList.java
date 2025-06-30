
import java.util.*;
class StudentList
{
    int Sid;
    String Sname;
    public StudentList(int sid, String sname) 
    {
        Sid = sid;
        Sname = sname;
    }
   /* @Override
    public String toString() 
    {
        return "StudentList [Sid=" + Sid + ", Sname=" + Sname + "]";
    }*/

    @Override
    public int hashCode()
     {
        return Objects.hash(Sname,Sid);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }
        StudentList other = (StudentList) obj;
        return this.Sid == other.Sid && Objects.equals(this.Sname, other.Sname);
    }


}
class EqualsExampleList
{
    public static void main(String[] args) 
    {
        List<StudentList> l=new ArrayList<>();
        StudentList s1=new StudentList(101, "alice");
        StudentList s2=new StudentList(101, "alice");
        l.add(s1);
        System.out.println(l.contains(s2));
        System.out.println(s1.equals(s2));
        System.out.println((s1.toString()));
        System.out.println(s2.toString());
       /* for(StudentList s:l)
        {
            System.out.println(s);
        }*/
    }
  
}