package ProgrammingStrings;

import java.util.Scanner;

public class Replace_Duplicate_$ {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the string");
		String s=ob.nextLine();
		String p=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char sh=s.charAt(j);
				if(sh==ch)
					count++;
			}
			if(count>1)
				p=p+'$';
			else
				p=p+ch;
			
		}
		System.out.println(p);
		
	}

}
