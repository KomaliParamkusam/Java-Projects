import java.util.function.IntFunction;

public class FunctionExample 
{
    public static void main(String[] args)
    {
        
        IntFunction<Integer> sumOfDigits = num -> {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        };

        int number = 1234;
        System.out.println("Sum of digits of " + number + " is " + sumOfDigits.apply(number));
    }
}

