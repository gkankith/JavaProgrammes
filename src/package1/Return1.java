package package1;

public class Return1 {

	public static void main(String[] args)
	{
	int a=add(10,20);
	System.out.println(a);
	 sub(a,10);

	}
	public static int add(int a,int b)
	{
		return(a+b);
		
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}

}
