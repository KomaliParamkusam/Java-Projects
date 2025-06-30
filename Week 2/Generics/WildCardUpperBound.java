import java.util.Arrays;
import java.util.List;

class WildCardUpperBound 
{
    
    public static int sumOfNumbers(List<? extends Number> list) 
    {
        int sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of Integers: " + sumOfNumbers(intList));
        System.out.println("Sum of Doubles: " + sumOfNumbers(doubleList));
    }
}

