package ProgrammingStrings;

import java.util.Scanner;

public class Check_Char_Pres_R_Not {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the string");
		String s=ob.nextLine();
		System.out.println("enter the char to check");
		char ch=ob.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char sh=s.charAt(i);
			if(sh==ch)
			{
				count++;
				break;
			}
		}
		if(count>0)
		{
			System.out.println("char is present");
		}
		else
		{
			System.out.println("char is not present");
		}

	}

}
