package programming;

import java.util.Scanner;

public class RightDiamond {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ob.nextInt();
		int star=1;
		int mid=(n/2)+1;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			if(i<mid)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println(" ");
		}
	}

}
