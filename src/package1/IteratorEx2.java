package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
	 ArrayList<String> a=new ArrayList<String>();
	 a.add("anki");
	 a.add("sam");
	 a.add("ram");
	 a.add("bhim");
	 
	Iterator<String> i=a.iterator();
	while(i.hasNext()==true)
	{
		
		String s=i.next();
		{
			if(s.equals("sam"))
			{
				i.remove();
			}
			else
			{
				System.out.println(s);
			}
		}
	}
	
	while(i.hasNext()==true)
	{
		
		String s=i.next();
		{
			if(s.equals("sam"))
			{
				i.remove();
			}
			else
			{
				System.out.println(s);
			}
		}
	}
	}
}


