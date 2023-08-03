package programming;

import java.util.Scanner;

public class AlphabetTriangle {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println(" enter the numb");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			char ch='A';
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
