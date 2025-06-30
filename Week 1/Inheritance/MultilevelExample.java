import java.util.*;
class Airtel
{
	static Scanner sc=new Scanner(System.in);
	int recharge(int plan)
	{
		if(plan==1)
		{	
			return 199;
		}
		else if(plan==2)
		{
			return 299;
		}
		else
		{
			return 399;
		}
	}
}
class Shop extends Airtel
{
	int bill;
	void Selection()
	{
		Plan();
		System.out.println("Select a plan");
		int n=sc.nextInt();
		if(n==1)
		{
			bill=bill+recharge(n);
		}
		else if(n==2)
		{
			bill=bill+recharge(n);
		}
		else
		{
			
			bill=bill+recharge(n);
		}
		System.out.println("Select an option");
		System.out.println("1.Another Recharge    2.Billing");
		int n1=sc.nextInt();
		if(n1==1)
		{
			Selection();
		}
		else
		{
			Billing();
		}
	}
	void Plan()
	{
		System.out.println("1.199rs/- plan 28 days");
		System.out.println("2.299rs/- plan 56 days");
		System.out.println("3.399rs/- plan 112 days");
	}
	void Billing()
	{
		System.out.println("Your Bill "+bill);
		System.out.println("Thank You");
	}
}
class MultilevelExample extends Shop
{
 	public static void main(String[] args)
	{
		MultilevelExample obj=new MultilevelExample();
		obj.Selection();
	}
}