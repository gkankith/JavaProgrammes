package ProgrammingArrays;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the array length");
		int l=ob.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int[l];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		int n=a.length-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}

}
