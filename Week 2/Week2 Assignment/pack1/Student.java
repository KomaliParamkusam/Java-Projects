package pack1;
public class Student 
{
    int Sid;
    String Sname;
    String Smail;

    public Student(int Sid, String Sname, String Smail) 
    {
        this.Sid = Sid;
        this.Sname = Sname;
        this.Smail = Smail;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int Sid) {
        this.Sid = Sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getSmail() {
        return Smail;
    }

    public void setSmail(String Smail) {
        this.Smail = Smail;
    }
    @Override
    public String toString() 
    {
        return "Student ID: " + Sid + ", Name: " + Sname + ", Email: " + Smail;
    }
}


