package package1;

import java.util.ArrayList;

public class ArrLisEx3 {

	public static void main(String[] args) {
	 ArrayList<Object> a=new ArrayList<Object>();
	 a.add("ankith");
	 a.add('A');
	 a.add(123);
	 a.add(true);
	 
	
	 
	 ArrayList<Integer> b=new ArrayList<Integer>();
	 b.add(12);
	 b.add(20);
	 b.add(14);

	

a.addAll(b);
System.out.print(a);

	}

}
