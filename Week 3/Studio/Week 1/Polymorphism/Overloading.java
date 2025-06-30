import java.util.*;
public class Overloading
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String a)
	{
		System.out.println("M1 "+a);
	}
	public static void main(String a,int b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.main(sc.next());
		obj.main(sc.next(),sc.nextInt());
	}
}

