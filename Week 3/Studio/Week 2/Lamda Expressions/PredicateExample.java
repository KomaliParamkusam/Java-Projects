import java.util.function.Predicate;

public class PredicateExample 
{
    public static void main(String[] args) 
    {
        
        Predicate<String> isPalindrome = str -> 
            str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        String word = "Madam";
        System.out.println(word + " is " + (isPalindrome.test(word) ? "a Palindrome" : "not a Palindrome"));
    }
}
