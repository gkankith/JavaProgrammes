package programming;

import java.util.Scanner;

public class RightAngleMirror {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter num");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
