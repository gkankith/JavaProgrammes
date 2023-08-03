package ProgrammingStrings;

import java.util.Scanner;

public class Frequency_Of_Character_String {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the string");
		String s=ob.nextLine();
		String n=" ";
		
		for(int i=0;i<s.length();i++)
		{
		
			char ch=s.charAt(i);
			int count=0;
			if(n.indexOf(ch)==-1)
			{
				
				for(int j=0;j<s.length();j++)
				{
					char sh=s.charAt(j);
					if(sh==ch)
						count++;
				}
				System.out.println(ch+" is occured for "+count+" no of times");
				n=n+ch;
			}
			
		}
		
	}

}
