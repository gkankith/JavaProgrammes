package package1;

import java.util.Scanner;

public class DynamicRead {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter 3 integers");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		System.out.println(a+b+c);
		System.out.println("enter the boolean values");
		boolean p=ob.nextBoolean();
		System.out.println(p);
		
		
	}

}
