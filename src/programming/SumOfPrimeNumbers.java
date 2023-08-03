package programming;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		int sum=0;
		for(int j=1;j<=10;j++)
		{
		int n=j;
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
	
		if(count==2)
		{
			sum=sum+n;
		}
		
	}
		System.out.println(sum);
		  
	}
	
}
