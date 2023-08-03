package ProgrammingArrays;

import java.util.Scanner;

public class Read_Store_ArrayEle_FromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter array length");
		int n=ob.nextInt();
		System.out.println("enter the array elements");
		int a[] =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=ob.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}
 
}
