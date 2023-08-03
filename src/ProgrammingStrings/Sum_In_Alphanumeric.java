package ProgrammingStrings;

import java.util.Scanner;

public class Sum_In_Alphanumeric {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=ob.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>'0'&&ch<='9')
			{
				int n=ch-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
