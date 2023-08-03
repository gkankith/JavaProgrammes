package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println(a);
		System.out.println("print using for loop");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("print using Iterator");
		Iterator<Integer> it=a.iterator();
		{
			while(it.hasNext()==true)
			{
				System.out.println(it.next());
			}
		}

	}

}
