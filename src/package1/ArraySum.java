package package1;

public class ArraySum {

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6};
		findSum(a);
		
		// TODO Auto-generated method stub

	}
	public static void findSum(int a[])
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
