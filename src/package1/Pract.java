package package1;

import java.util.ArrayList;

public class Pract {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		
		a.add('A');
		a.add("ankith");
		a.add(true);
		a.add(123);
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(12);
		b.add(20);
		
		a.addAll(b);
		System.out.println(a);

	}

}
