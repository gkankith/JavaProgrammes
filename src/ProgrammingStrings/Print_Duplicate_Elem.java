package ProgrammingStrings;

import java.util.Scanner;

public class Print_Duplicate_Elem {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the string");
		String s=ob.nextLine();
		String duplicate=" ";

		for(int i=0;i<s.length();i++)
		{

			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char sh=s.charAt(j);
				if(sh==ch)
				{
					count++;
				}
			}
			//System.out.println(count);
			if(count>1)
				duplicate=duplicate+ch;
			
				
		}
		System.out.println(duplicate);
		
	}
	

}
