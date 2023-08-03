package ProgrammingArrays;

import java.util.Scanner;

public class Two_Dim_Array {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=ob.nextInt();
		System.out.println("enter the no of columns");
		int col=ob.nextInt();
		
		int [][] a=new int [row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		
	}
	}

}
