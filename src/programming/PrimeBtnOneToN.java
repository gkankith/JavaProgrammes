package programming;

import java.util.Scanner;

public class PrimeBtnOneToN {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			int m=i;
			int count=0;
			for(int j=1;j<=m;j++)
			{
				if(m%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(m);
			}
		}
	}

}
