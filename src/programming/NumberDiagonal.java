package programming;

import java.util.Scanner;

public class NumberDiagonal {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println(" enter the numb");
		int n=ob.nextInt();
		int mid=(n/2)+1;
		for(int i=1;i<=n;i++)
		{
			int num=1;
			for(int j=1;j<=n;j++)

					{
						if(i==j||(i+j==n+1))
						{
							System.out.print(num);
						}
						else
						{
							System.out.print(" ");
						}
						
						if(i<mid)
						{
							num++;
						}
						else
						{
							num--;
						}
						
					}
			
					
				}
			System.out.println(" ");
		}

	
}
