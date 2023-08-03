package package1;

import java.util.Scanner;

public class LeastArray {

	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner ob=new Scanner(System.in);
		System.out.println("enetr the elements");
		
		for(int i=0;i<5;i++)
		{
			a[i]=ob.nextInt();
		}
		int min=a[0];
		for(int i=1;i<4;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				
			}
				
		}
		System.out.println(min);
	}
}

		
