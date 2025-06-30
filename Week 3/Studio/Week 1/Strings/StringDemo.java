public class StringDemo 
{
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Hello"; 
        
        
        String str3 = new String("Hello"); 
        String str4 = new String("Hello"); 

        System.out.println("Pool: " + (str1 == str2)); 
        System.out.println("heap: " + (str1 == str3)); 
        System.out.println("Pool & Heap: " + (str3 == str4)); 
        System.out.println("Data " + str1.equals(str3)); 
    }
}

