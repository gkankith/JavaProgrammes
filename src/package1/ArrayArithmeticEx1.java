package package1;

public class ArrayArithmeticEx1 {

	public static void main(String[] args) 
	{
		int z=25;
		try
		{
		division(z);
		}
		catch(ArithmeticException ob)
		{
			System.out.println(ob);
			ob.printStackTrace();
		}
		System.out.println("handled in caller method");

	}
	public static void division(int a)
	{
		System.out.println(a/5);
		System.out.println(a/4);
		System.out.println(a/0);
		System.out.println("hello");
	}

}
