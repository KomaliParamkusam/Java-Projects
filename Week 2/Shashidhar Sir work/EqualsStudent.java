
import java.util.Objects;

class EmployeeInfo
{
    String name;
    int age;

    EmployeeInfo(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() 
    {
        
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) 
    {
        
        if (obj == null) {
        return false;
        }
        if (getClass() != obj.getClass()) {
        return false;
        }
        final EmployeeInfo other = (EmployeeInfo) obj;
        if (this.age != other.age) 
        {
        
            return false;
        }
        return Objects.equals(this.name, other.name);
        

    }
}

public class EqualsStudent 
{
    public static void main(String[] args) {
        EmployeeInfo p1 = new EmployeeInfo("John", 225);
        EmployeeInfo p2 = new EmployeeInfo("John", 225);

        System.out.println(p1.equals(p2)); //it shows false because by default it checks references as it is not overriden
    }
}
