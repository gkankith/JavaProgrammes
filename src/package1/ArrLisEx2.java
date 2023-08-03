package package1;

import java.util.ArrayList;

public class ArrLisEx2 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("very");
		a.add("good morning");
		a.add("welcome to Collection Framework");
		a.add("its going well");
		
		
		System.out.println(a);
		boolean b=a.contains("sql");
		if(b==true)
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("hello");
		}

	}

}
