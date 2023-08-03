package programming;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ob.nextInt();
		int star=1;
		int mid=(n/2)+1;
		int space=mid-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k==1||k==star)
				{
					System.out.print("*");
					
				}
				else
					System.out.print(" ");
			}
			if(i<mid)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			System.out.println(" ");
		}
	}

}
