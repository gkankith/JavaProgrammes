package programming;

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enetr the num");
		int n=ob.nextInt();
		int star=1;
		int mid=(n/2)+1;
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k==1||k==star||i==n)
				System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
			star+=2;
			space--;
			System.out.println(" ");
		}
	}

}
