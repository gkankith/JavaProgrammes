package programming;

import java.util.Scanner;

public class SpaceAndStar {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("-");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
