package programming;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
