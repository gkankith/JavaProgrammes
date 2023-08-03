package package1;

import java.util.Scanner;

public class EncapsuleEx1 {
	private int pin;
	private double balance;
public EncapsuleEx1(int pin,double balance)
{
	this.pin=pin;
	this.balance=balance;
}
public void getBalance()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enetr your existing pin");
	int p=ob.nextInt();
	if(p==pin)
	{
		System.out.println("your balance is "+balance);
	}
	else
	{
		System.out.println("inavlid pin");
	}
}
public void setPin()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enetr your existing pin");
	int p=ob.nextInt();
	if(p==pin)
	{
		System.out.println("enter your new pin");
		pin=ob.nextInt();
		System.out.println("pin updated successfully");
	}
	else
	{
		System.out.println("invalid pin");
	}
}

}
