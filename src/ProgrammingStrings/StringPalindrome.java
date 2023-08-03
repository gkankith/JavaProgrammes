package ProgrammingStrings;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="KANAK";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("it is a palin");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}

}
}
