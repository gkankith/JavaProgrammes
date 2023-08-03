package ProgrammingArrays;

import java.util.Scanner;

public class Insert_Element_Into_Array {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		int a[]= {10,20,2,41,21,323};
		System.out.println("enter the element to be inserted");
		int element=ob.nextInt();
		System.out.println("enter the index number");
		int index=ob.nextInt();
		int ind=0;
		int b[]=new int[a.length+1];
		for(int i=0;i<=a.length;i++)
		{
			if(i==index)
				b[i]=element;
			else
				b[i]=a[ind++];
		}
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
