package package1;

import java.util.Scanner;

public class CustomExcp {

	public static void main(String[] args)
	{
		try
		{
			view();
		}
		finally
		{
			System.out.println("done");
		}
	}
	public static void view()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(b==3)
		{
			throw new ArithmeticException("num should be greater than 3");
		}
		else
		{
			System.out.println("continue");
		}

	}

}
