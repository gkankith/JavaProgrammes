package package1;

import java.util.Scanner;

public class Aster1 {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.println("*");
			}
		}
	}

}
