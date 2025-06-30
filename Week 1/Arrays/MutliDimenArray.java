import java.util.*;
public class MutliDimenArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows1");
		int r1=sc.nextInt();
        System.out.println("Enter cols1");
		int c1=sc.nextInt();
		int[][] a=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
        System.out.println("Enter rows2");
		int r2=sc.nextInt();
        System.out.println("Enter cols2");
		int c2=sc.nextInt();
		int[][] b=new int[r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		if(c1==r2)
		{
			int[][] c=new int[r1][c2];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<c1;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
				
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Multiplication of matrix not possible");
		}
	}
} 