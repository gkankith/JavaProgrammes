package package1;
import java.util.Scanner;
public class ArrayAll {

	public static void main(String [] args)
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		printF(a);
		printB(a);
		printTotal(a);
	}
	public static void printF(int a[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void printB(int a[])
	{
		for(int i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void printTotal(int a[])
	{
		int total=0;
		for(int i=0;i<5;i++)
		{
			total=total+a[i];
		}
		System.out.println(total);
	}


}
