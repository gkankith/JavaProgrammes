package package1;

public class ArrayEx1 {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40};
		add(a);
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	public static void add(int a[])
	{
		for(int i=0;i<4;i++)
		{
			a[i]=a[i]+1;
		}
	}

}
