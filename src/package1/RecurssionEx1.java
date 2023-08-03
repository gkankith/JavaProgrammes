package package1;

public class RecurssionEx1 {

	public static void main(String[] args) 
	{
	add(10,20);

	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		add(a,b);
	}


}
