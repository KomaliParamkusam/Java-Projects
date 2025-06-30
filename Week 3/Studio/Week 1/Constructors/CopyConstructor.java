class StudentInfo 
{
    private String name;
    private int age;

    
    public StudentInfo(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public StudentInfo(StudentInfo other) 
    {
        this.name = other.name; 
        this.age = other.age;   
    }
    
   
    public void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    
}
public class CopyConstructor 
{
    public static void main(String[] args) 
    {
        StudentInfo s1 = new StudentInfo("John", 21); 
        s1.setName("Mallika");
        StudentInfo s2 = new StudentInfo(s1);  
        s1.setName("Mallika");       

        System.out.println("Original Student Object:");
        s1.display();

        System.out.println("Copied Student Object:"); //generally copy constructor is used when we need deep copy of objects
        s2.display();
    }
}
