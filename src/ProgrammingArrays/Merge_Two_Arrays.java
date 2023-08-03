package ProgrammingArrays;

public class Merge_Two_Arrays {

	public static void main(String[] args) {

		int a[]= {1,3,2,4,7,11};
		int b[]= {10,34,23,12,99,16};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
				c[i]=b[i-a.length];
		}
		for(int v:c)
		{
			System.out.println(v);
		}
		/*for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}*/

	}

}
