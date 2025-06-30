import java.util.*;
class NestedExceptions
{
	static Scanner sc=new Scanner(System.in);
	
	static void m1(int a,int b)
	{
		try
		{
			int c=a/b;
			try
			{
				int n=sc.nextInt();
				int[] arr=new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}	
				for(int i=0;i<=n;i++)
				{
					System.out.println(arr[i]);
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			try
			{
				String s=null;
				int len=s.length();
			}
			catch(NullPointerException n)
			{
				System.out.println(n);
			}
		}
		finally
		{
			try
			{
				m1(sc.nextInt(),sc.nextInt());
			}
			catch(InputMismatchException e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		m1(sc.nextInt(),sc.nextInt());
	}
}
