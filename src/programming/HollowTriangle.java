package programming;

import java.util.Scanner;

public class HollowTriangle {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==n)||(j==1)||(i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
