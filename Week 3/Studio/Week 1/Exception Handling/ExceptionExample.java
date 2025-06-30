
import java.util.Scanner;
class NotEligibleException extends RuntimeException
{

    public NotEligibleException(String message) 
    {
        super(message);
    }
    
}
class ExceptionExample
{
    public void Method()
    {
        try
        {

            int val = 10/0;
            System.out.println(val);

        } 
        catch (ArithmeticException e) 
        {

            System.out.println(" ArithmeticException EXception ");
            throw new NotEligibleException("Not Eligible Exception");
        }
        catch(Exception e)
        {
            System.out.println(" Exception block");
        }
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            ExceptionExample obj=new ExceptionExample();
          
              obj.Method();
            
          
        }
    }

}