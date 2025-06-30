import java.util.*;
class StackExample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Character> st=new Stack<>();
		int i;
		for(i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
			{
				st.push(ch);
			}
			else if(!st.empty())
			{
				if(ch==')' && st.pop()!='(')
				{
					break;
				}
				else if(ch=='}' && st.pop()!='{')
				{
					break;
				}
				else if(ch==']' && st.pop()!='[')
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
		if(st.empty() && i==s.length())
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
} 
