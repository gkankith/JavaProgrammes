package ProgrammingArrays;

import java.util.Scanner;

public class Prac {

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
	int temp=0;
	for(int i=0;i<n;i++)
	{
		temp=a[i];
		a[i]=a[n];
		a[n]=temp;
		n--;
		
	}
	for(int i:a)
	{
		System.out.println(i);
	}
	}
}
