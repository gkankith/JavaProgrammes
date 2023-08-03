package ProgrammingStrings;

import java.util.Scanner;

public class Print_Unique_Char_In_String {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the string");
		String s=ob.nextLine();
		String unique=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(unique.indexOf(ch)==-1)
			{
				unique=unique+ch;
			}
		}
		System.out.println(unique);
	}

}
