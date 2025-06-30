import java.util.function.BiFunction;

class Calculator 
{
    
    public static int add(int a, int b) 
    {
        return a + b;
    }
}

public class MethodReferenceExample1 
{
    public static void main(String[] args) 
    {
        
        BiFunction<Integer, Integer, Integer> lambdaAddition = (a, b) -> Calculator.add(a, b);

       
        BiFunction<Integer, Integer, Integer> methodRefAddition = Calculator::add;
        System.out.println("Lambda Addition: " + lambdaAddition.apply(5, 10));
        System.out.println("Method Reference Addition: " + methodRefAddition.apply(5, 10));
    }
}

