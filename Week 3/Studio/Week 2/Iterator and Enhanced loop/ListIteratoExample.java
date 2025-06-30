import java.util.*;
class ListIteratoExample
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.remove(new Integer(30));
		al.add(1,60);
		al.set(3,100);
		ListIterator<Integer> itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		System.out.println("Reversing the list");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous()+" ");
		}
		
		
	}
}
