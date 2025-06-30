import java.util.*;
abstract class Abs1
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(int a);
	String m2(boolean b)
	{
		System.out.println("Hi Iam M2: "+b);
		return sc.next();
	}
}
abstract class Abs2 extends Abs1
{
	abstract char m3(float f);
	void m4(long l)
	{
		System.out.println("Hi Iam m4: "+l);
	}
}
class UpcastingExample extends Abs2
{
	int m1(int a)
	{
		System.out.println("Hi Iam M1: "+a);
		return sc.nextInt();
	}
	char m3(float f)
	{
		System.out.println("Hi Iam M3: "+f);
		return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
		Abs1 obj=new UpcastingExample();
		Abs2 obj1=new UpcastingExample();
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(obj.m2(sc.nextBoolean()));
		System.out.println(obj1.m3(sc.nextFloat()));
		obj1.m4(sc.nextLong());
	}
}