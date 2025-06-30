import java.util.*;
class LamdaExpression1
{
    public static void main(String[] args) 
        
    {
        ArrayList<String> nameslist=new ArrayList<>();
        nameslist.add("Zara");
        nameslist.add("Komali");
        nameslist.add("Bharath");
        nameslist.add("Navya");
        nameslist.add("Monika");
        System.out.println("Before sorting: "+nameslist);
        Collections.sort(nameslist,(a,b)-> a.compareTo(b));
        System.out.println("After Sorting: "+nameslist);
    }
    
    
}