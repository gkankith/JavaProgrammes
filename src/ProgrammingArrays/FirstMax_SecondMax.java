package ProgrammingArrays;

public class FirstMax_SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[]{22,4,38,1,56,3,9};
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			if(n>fl)
			{
				sl=fl;
				fl=n;
			}
			else if(n>sl)
			{
				sl=n;
			}
		}
		System.out.println(fl);
		System.out.println(sl);
		

	}

}
