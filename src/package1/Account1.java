package package1;

import java.util.Scanner;

public class Account1 {
	int pin;
	double balance;
	
	public Account1(int pin,double balance)
	{
		this.pin=pin;
		this.balance=balance;
	}

	public static void main(String[] args)
	{
		Account1 ob=new Account1(1234,3000d);
		try
		{
			ob.withdraw();	
		}
		finally
		{
			System.out.println("thank you for using our banking services");
		}
		ob.checkBalance();
		
	}
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your pin");
		int pin=sc.nextInt();
		if(this.pin!=pin)
		{
			throw new InvalidPinException("invalid pin");
		}
		else
		{
			System.out.println("enter the withdrawal amount");
			double amount=sc.nextDouble();
			if(amount>balance)
			{
				throw new InvalidPinException("low balance");
			}
			else
			{   
				
				System.out.println("collect your cash");
				balance=balance-amount;
			}
		}
	}
	public void checkBalance()
	{
		System.out.println("your remaining balance is "+balance);
	}

}
