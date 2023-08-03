package ProgrammingArrays;

public class Frequency_Of_Element {

	public static void main(String[] args) {

		int a[]= {10,2,5,1,10,2,4,10};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			if(b[i]==false)
			{
		     int count=0;
			for(int j=0;j<a.length;j++)
			{
				int num=a[j];
				if(n==num)
				{
					count++;
				  b[j]=true;
				}
			}
			System.out.println(n+" is occured for "+count+" number of times");
		}
		}
	}

}
