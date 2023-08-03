package programming;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ob.nextInt();
		int star=(n*2-1);
		int space=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println(" ");
		}
	}

}
