package ProgrammingStrings;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {

		
		int a[]= {10,20,10,20,2,3};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int n=a[i];
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
					count++;
			}
			if(count==2)
				System.out.println(n);
			
		}
		
		
		

	}
}