import java.util.*;

public class HashMapExample
{
    public static void main(String[] args) {
       
        Map<String, Integer> studentMarks = new HashMap<>();

       String nam="john";
        studentMarks.put("name"+nam, 85);
        studentMarks.put("Komali", 92);
        studentMarks.put("Bharath", 76);
        studentMarks.put("Vicky", 89);
        studentMarks.put("Monika", 65);

        System.out.println("Student Marks: " + studentMarks);

       
        if (studentMarks.containsKey("Monika")) 
        {
            studentMarks.put("Monika", 72); 
            System.out.println("Updated Monika's Marks: " + studentMarks.get("Monika"));
        }
        studentMarks.remove("John");
        System.out.println("After Removing John: " + studentMarks);

        
        if (studentMarks.containsKey("Vicky")) {
            System.out.println("Vicky's Marks: " + studentMarks.get("Vicky"));
        } 
        else 
        {
            System.out.println("Vicky is not in the record.");
        }
        System.out.println("Student Marks: ");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) 
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Students List with names:");
        for (String name : studentMarks.keySet()) 
        {
            System.out.println(name);
        }
        System.out.println("Marks List with marks:");
        for (int mark : studentMarks.values()) 
        {
            System.out.println(mark);
        }
    }
}

