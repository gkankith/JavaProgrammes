package programming;

import java.util.Scanner;

public class AlphaNumericRightAngleTriangle {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println(" enter the numb");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=1; char ch='A';
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					if(j%2==0)
					{
						System.out.print(ch++);
					}
					else
					{
						System.out.print(num++);
					}
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
