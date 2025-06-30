import java.util.*;
interface Int1
{
	int m1(String a);
}
interface Int2
{
	char m2(boolean b);
}
abstract class Abs 
{
	
	Abs(float f)
	{
		System.out.println("Parameterized const: "+f);
	}
 	void m3(long l)
	{
		System.out.println("Hi Iam M3: "+l);
	}
	abstract void m4(char c);
}
class Conc
{
	static Scanner sc=new Scanner(System.in);
	int m5(String s)
	{
		System.out.println("Hi Iam M5: "+s);
		return sc.nextInt();
	}
}
class AbstractionExample extends Abs implements Int1,Int2
{
	static Scanner sc=new Scanner(System.in);
	public int m1(String a)
	{
		System.out.println("Hi Iam M1: "+a);
		return sc.nextInt();
	}
	public char m2(boolean b)
	{
		System.out.println("Hi Iam M2: "+b);
		return sc.next().charAt(0);
	}
	void m4(char c)
	{
		System.out.println("Hi iam M4: "+c);
	}
	AbstractionExample()
	{
		super(sc.nextFloat());
	}
	public static void main(String[] args)
	{
		AbstractionExample obj=new AbstractionExample();
		Conc obj1=new Conc();
		System.out.println(obj.m1(sc.next()));
		System.out.println(obj.m2(sc.nextBoolean()));
		obj.m3(sc.nextLong());
		obj.m4(sc.next().charAt(0));
		System.out.println(obj1.m5(sc.next()));
	}
		
		
}