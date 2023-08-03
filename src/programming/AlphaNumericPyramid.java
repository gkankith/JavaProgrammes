package programming;

import java.util.Scanner;

public class AlphaNumericPyramid {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println(" enter the numb");
		int n=ob.nextInt();
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			char ch='A'; int num=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k%2==0)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print(num++);
				}
			}
			star+=2;
			space--;
			System.out.println(" ");
		}
		
		
	}

}
