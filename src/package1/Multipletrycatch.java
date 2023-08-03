package package1;

import java.util.Scanner;

public class Multipletrycatch 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int x[]=new int [5];
		System.out.println("enter the array elemnts");
		for(int i=0;i<5;i++)
		{
			x[i]=s.nextInt();
		}
		
		try
		{
			System.out.println(a/b);
            for(int i=0;i<=5;i++)
            {
            	System.out.println(x[i]);
            }
		}
		catch(ArithmeticException ob)
		{
			System.out.println("1st catch");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("2nd catch");
		}
		finally
		{
			System.out.println("done");
		}
	}
		

	

}
