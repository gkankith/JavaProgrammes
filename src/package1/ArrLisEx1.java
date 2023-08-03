package package1;

import java.util.ArrayList;

public class ArrLisEx1 {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("hello");
		a.add(true);
		a.add('A');
		a.add(123);
		
		System.out.println(a.size());
		for(Object i:a)
		{
			System.out.println(i);
		}

	}

}
