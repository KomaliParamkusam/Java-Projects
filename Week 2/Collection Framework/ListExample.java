import java.util.*;
public class ListExample 
{
    public static void main(String[] args) 
    {
        
        List<String> employees = new ArrayList<>();

        employees.add("Komali");
        employees.add("Navya");
        employees.add("Amala");
        employees.add("Monika");
        System.out.println("Employee List: " + employees);
        employees.remove("Amala"); 
        System.out.println("After Removing Amala: " + employees);
        employees.remove(1);
        System.out.println("After Removing at Index 1: " + employees);
        employees.set(0, "Vicky"); 
        System.out.println("After Updating First Employee: " + employees);
        if (employees.contains("Monika")) 
        {
            System.out.println("Monika is in the employee list.");
        } 
        else 
        {
            System.out.println("Monika is not in the employee list.");
        }

        if (employees.contains("Komali")) 
        {
            System.out.println("Komali is in the employee list.");
        } else 
        {
            System.out.println("Komali is not in the employee list.");
        }

        System.out.println("Final Employee List:");
        for (String employee : employees) 
        {
            System.out.println(employee);
        }
    }
}

