package programming;

import java.util.Scanner;

public class AlphabetTriangle2 {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println(" enter the numb");
		int n=ob.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	

}
