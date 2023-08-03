package programming;

import java.util.Scanner;

public class NumbPyramid {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ob.nextInt();
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			int t=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
		
			for(int k=1;k<=star;k++)
			{
			
				int mid=(star/2)+1;
				if(k<mid)
				{
					System.out.print(t++);
				}
				else
				{
					System.out.print(t--);
				}
			}
			star+=2;
			space--;
			System.out.println(" ");
		}
	}

}
