import java.util.*;

public class CollectionsExample 
{
    public static void main(String[] args) 
    {
        
        List<Integer> numbers = new ArrayList<>(Arrays.asList(45, 12, 78, 34, 23, 78, 90));
        System.out.println("Original List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numbers);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
        Collections.replaceAll(numbers, 78, 99);
        System.out.println("List after replacing 78 with 99: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
    }
}
