package package1;

import java.util.Scanner;

public class DynamicEx4 
{
	String name;
	int age;
	long contact;
	public DynamicEx4(String name,int age,long contact)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the name");
		String a=ob.next();
		System.out.println("enter your age");
		int b=ob.nextInt();
		System.out.println("enter your contact");
		long c=ob.nextLong();
		DynamicEx4 p=new DynamicEx4(a,b,c);
		p.print();
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(contact);
	}

}
