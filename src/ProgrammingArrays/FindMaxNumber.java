package ProgrammingArrays;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {22,342,24,3,5,68,2,99,1,343};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);

	}

}
