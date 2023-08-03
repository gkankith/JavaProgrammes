package package1;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the string");
    String a=ob.nextLine();
    String b="";
    for(int i=a.length()-1;i>=0;i--)
    {
    	b=b+a.charAt(i);
    }
    if(a.equalsIgnoreCase(b))
    {
    	System.out.println(a+"is a palindrome");
    }
    else 
    {
    	System.out.println(a+"is not a palindrome");
    }
	}

}
