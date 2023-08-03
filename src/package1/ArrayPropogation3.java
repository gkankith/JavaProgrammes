package package1;

public class ArrayPropogation3 {

	public static void main(String[] args) 
	{
		int a=20;
		div(a);
		System.out.println("caller method continues");

	}
	public static void div(int a)
	{

		System.out.println(a/2);
		System.out.println(a/3);
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException ob)
		{
			
		}
	    System.out.println("called method continues");
		
	}

}
