import java.util.*;

class Employee
{
    String Ename;
    int Eid;
    double Esal;

    public Employee(int Eid, String Ename, double Esal) 
    {
        this.Eid = Eid;
        this.Ename = Ename;
        this.Esal = Esal;
    }

    @Override
    public String toString() 
    {
        return "Employee [Ename=" + Ename + ", Eid=" + Eid + ", Esal=" + Esal + "]";
    }
}
class ComparatorInterface 
{
    public static void main(String[] args)
    {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(102, "vicky", 60000));
        emp.add(new Employee(89, "alice", 60000));
        emp.add(new Employee(204, "bob", 30000));
        Collections.sort(emp,new Comparator<Employee>() 
        {
            public int compare(Employee e1,Employee e2)
            {
                if(e1.Esal==e2.Esal)
                {
                    return Integer.compare(e1.Eid,e2.Eid);
                }
                return Double.compare(e1.Esal,e2.Esal);
            }
        });
        System.out.println(emp);

    }
}