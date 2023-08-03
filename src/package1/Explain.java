package package1;

import java.util.Scanner;



public class Explain {
	int age;
	long idno;
	double pincode;
	
	public Explain(int age,long idno,double pincode)
	{
		this.age=age;
		this.idno=idno;
		this.pincode=pincode;
	}
	
	public void voterId()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int a=s.nextInt();
		
		if(a<age)
		{
			throw new ArithmeticException("your age must be above 21 ");
		}
		else
		{  
			System.out.println("enter your city pincode");
		    double p=s.nextDouble();
		    if(p!=pincode)
		    {
		    	throw new ArithmeticException("invalid pincode");
		    }
		    else
		    {
			System.out.println("your voter id number is "+idno);
		    }
		}

		}

	public static void main(String[] args)
	{
		Explain ob=new Explain(21,8762162228l,577547);
		ob.voterId();

	}

}
