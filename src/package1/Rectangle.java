package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Rectangle implements Comparable<Rectangle>{
	int length;
	int breadth;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public String toString()
	{
		return length+" "+breadth;
	}
	public int compareTo(Rectangle a)
	{
		return this.length-a.length;
	}
	public void findArea()
	{
		System.out.println(length);
		System.out.println(breadth);
		int c =length*breadth;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ArrayList<Rectangle> a=new ArrayList<Rectangle>();
		a.add(new Rectangle(4,4));
		a.add(new Rectangle(3,6));
		a.add(new Rectangle(5,8));
	
	
	
		Collections.sort(a);
		System.out.println(a);
		
		System.out.println("printing using for loop");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("printing using Iterator");
		Iterator it=a.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}

	}

}
