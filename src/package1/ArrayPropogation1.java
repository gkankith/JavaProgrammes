package package1;

public class ArrayPropogation1 {

	public static void main(String[] args)
	{
       int a=10;
       div(a);

	}
	public static void div(int x)
	{
		int c=(x/0);
		System.out.println(c);
	}

}
