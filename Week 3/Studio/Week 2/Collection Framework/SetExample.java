import java.util.*;

public class SetExample 
{
    public static void main(String[] args) 
    {
        
        Set<String> carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Honda");
        carBrands.add("BMW");
        carBrands.add("Tesla");
        carBrands.add("BMW"); 

        System.out.println("Car Brands : " + carBrands);
        carBrands.remove("Tesla");
        System.out.println("After Removing Tesla: " + carBrands);
        if (carBrands.contains("Honda")) 
        {
            System.out.println("Honda is in the set.");
        } else 
        {
            System.out.println("Honda is not in the set.");
        }
        System.out.println("Car Brands using Iterator:");
        Iterator<String> iterator = carBrands.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
        carBrands.clear();
        System.out.println("\nAfter Clearing the Set: " + carBrands);
    }
}
