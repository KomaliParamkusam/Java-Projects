import java.util.*;
interface I1
{
	void m1(String s);
}
interface I2
{
	boolean m2(int a);
}
interface I3
{
	int m3(double d);
}
class InterfaceExample implements I1,I2,I3
{
	static Scanner sc=new Scanner(System.in);
	public void m1(String s)
	{
		System.out.println("Hi Iam M1: "+s);
	}
	public boolean m2(int a)
	{
		System.out.println("Hi Iam M2: "+a);
		return sc.nextBoolean();
	}
	public int m3(double d)
	{
		System.out.println("Hi Iam M3: "+d);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		InterfaceExample obj=new InterfaceExample();
		obj.m1(sc.next());
		System.out.println(obj.m2(sc.nextInt()));
		System.out.println(obj.m3(sc.nextDouble()));
	}
}	
