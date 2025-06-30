package pack1;
public class Instructor 
{
    int Iid;
    String Iname;
    String specialization;

    public Instructor(int Iid, String Iname, String specialization)
    {
        this.Iid = Iid;
        this.Iname = Iname;
        this.specialization = specialization;
    }

    public int getIid() 
    {
        return Iid;
    }

    public void setIid(int Iid) 
    {
        this.Iid = Iid;
    }

    public String getIname() 
    {
        return Iname;
    }

    public void setIname(String Iname) 
    {
        this.Iname = Iname;
    }

    public String getSpecialization()
     {
        return specialization;
    }

    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization;
    }
    @Override
    public String toString() 
    {
        return "Instructor ID: " + Iid + ", Name: " + Iname + ", Specialization: " + specialization;
    }
}

