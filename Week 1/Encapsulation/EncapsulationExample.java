class EmployeeInfo
{
    private String name;
    private double salary;

    public EmployeeInfo(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }

    
    public String getName() 
    {
        return name;
    }

  
    public double getSalary(String role) 
    {
        if (role.equals("Manager")) 
        {
            return salary;
        } else 
        {
            System.out.println("Access Denied! Salary is confidential.");
            return 0;
        }
    }

    
    public void setSalary(double salary, String role) 
    {
        if (role.equals("Manager")) 
        {
            this.salary = salary;
            System.out.println("Salary updated!");
        }
        else 
        {
            System.out.println("Permission Denied! Only managers can update salary.");
        }
    }
}

public class EncapsulationExample 
{
    public static void main(String[] args) 
    {
        EmployeeInfo emp = new EmployeeInfo("Alice", 60000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary (Employee Role): " + emp.getSalary("Employee"));
        System.out.println("Employee Salary (Manager Role): " + emp.getSalary("Manager"));

        emp.setSalary(70000, "Employee");
        emp.setSalary(70000, "Manager");   
    }
}

