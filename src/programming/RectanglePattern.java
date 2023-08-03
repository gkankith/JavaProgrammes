package programming;

import java.util.Scanner;

public class RectanglePattern {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("entter the num");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
