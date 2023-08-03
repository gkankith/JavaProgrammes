package package1;

import java.util.Scanner;

public class Account {
	int pin;
	double balance;
	
	public Account(int pin,double balance)
	{
		this.pin=pin;
		this.balance=balance;
	}

	public static void main(String[] args) 
	{
		Account ob=new Account(1212,5000d);
		try
		{
        ob.withdraw();
       
		}
		
		finally
		{
			System.out.println("thank you for using our banking services");
		}
		
	}
	public void checkBalance()
	{
		
		System.out.println("your balance is "+ balance);
	}
		
		
	public void withdraw()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your pin");
		int pin=s.nextInt();
		if(this.pin==pin)
		{
			System.out.println("enetr the amount of withdrawal");
			double amount=s.nextDouble();
			
		if(amount>balance)
		{
			throw new InSufficientBalanceException("low balance");
			
		}
		else
		{
			this.checkBalance();
			System.out.println("collect your cash");
			balance=balance-amount;
			
		}
		}
		else
		{
			System.out.println("invalid pin");
		}
		}
	
	}


