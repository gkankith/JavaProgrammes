package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class NoSuchEleEx {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		Iterator<String> it=a.iterator();
		while(it.hasNext()==true)
		{
			System.out.println("hello");
			System.out.println(it.next());
		}

	}

}
