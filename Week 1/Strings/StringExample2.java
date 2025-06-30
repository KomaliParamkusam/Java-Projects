import java.util.*;
class StringExample2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		if(n==9)
		{
			int cc=0,smc=0,dc=0,spc=0;
			for(int i=0;i<n;i++)
			{
				char ch=str.charAt(i);
				if(Character.isUpperCase(ch))
				{
					cc++;
				}
				else if(Character.isLowerCase(ch))
				{
					smc++;
				}
				else if(Character.isDigit(ch))
				{
					dc++;
				}
				else if(ch!=' ')
				{
					spc++;
				}
				else
				{
					break;
				}
			}
			if(cc>=1 && smc>=1 && dc>=1 && spc>=1)
			{
				System.out.println("Valid Password");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Valid Password");
		}
	}
}