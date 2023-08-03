package ProgrammingArrays;

import java.util.Scanner;

public class CheckEle_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the element");
		int num=ob.nextInt();
		int a[]=new int[] {10,2,44,5,1,34};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			if(n==num)
				count++;
				
			
		}
		if(count==1)
			System.out.println(num+" is present");
		else
			System.out.println(num+" is not present");
		

	}

}
