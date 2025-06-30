import java.util.*;
class HandleMultiple
{
	static Scanner sc=new Scanner(System.in);
	static void m1()
	{
		try
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.print(a/b);
			a=sc.nextInt();
			String s=null;
			int len=s.length();
			
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		catch(InputMismatchException i)
		{
			System.out.println(i);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args)
	{
		m1();
	}
}
