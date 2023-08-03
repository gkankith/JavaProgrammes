package package1;

import java.util.Scanner;

public class Expr {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter 2 integers");
		int a=ob.nextInt();
		int b=ob.nextInt();
		try
		{
			div(a,b);	
		}
		finally
		{
			System.out.println("finally exe");
		}
		System.out.println("caller statement ");
		add(a,b);

	}
	public static void div(int a,int b)
	{
		System.out.println("hi");
		System.out.println(a/b);	
		System.out.println("hello");
				
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}

}
