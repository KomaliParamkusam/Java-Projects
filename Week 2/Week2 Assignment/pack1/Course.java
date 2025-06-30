package pack1;
public class Course
{
    int Cid;
    String Cname;
    int duration;

    public Course(int Cid, String Cname, int duration) 
    {
        this.Cid = Cid;
        this.Cname = Cname;
        this.duration = duration;
    }
    public int getCid()
     {
        return Cid;
    }

    public void setCid(int Cid) 
    {
        this.Cid = Cid;
    }

    public String getCname() 
    {
        return Cname;
    }

    public void setCname(String Cname) 
    {
        this.Cname = Cname;
    }

    public int getDuration() 
    {
        return duration;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }
    @Override
    public String toString() 
    {
        return "Course [Cid=" + Cid + ", Cname=" + Cname + ", Duration=" + duration + " months ]";
    }
   
}

