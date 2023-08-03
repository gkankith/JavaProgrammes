package package1;

import java.util.Scanner;

public class Matrimony 
{

	public static void main(String[] args) 
	{
		try
		{
			register();
		}
		finally
		{
			System.out.println("done");
		}

	}

	
	public static void register()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int a=s.nextInt();
		
	  if(a<21)
	  {
		  throw new InvalidAge("under age");
	  }
	  else
	  {
		  System.out.println("continue");
	  }
	}
	
	  
	  
	 

}
