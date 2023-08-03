package ProgrammingArrays;

public class Find_Len_Without_Inb_Meth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {2,5,1,6,9,99,2};
		int count=0;
		for(int i=0; ;i++)
		{
			try 
			{
			int n=a[i];
			count++;
		   }
			catch(ArrayIndexOutOfBoundsException ob)
			{
				break;
			}
			

	}
		System.out.println(count);

}
}
