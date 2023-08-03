package ProgrammingStrings;

public class Remove_Char_from_String {

	public static void main(String[] args) {

		String s="umbrella";
		String n =" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='l')
			{
				n=n+ch;
			}
			
		}
		System.out.println(n);
		
	}

}
