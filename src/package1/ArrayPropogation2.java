package package1;

public class ArrayPropogation2 {

	public static void main(String[] args) 
	{
      int z=10;
      try
      {
    	  div(z);
      }
      catch(ArithmeticException ob)
      {
    	  
      }
      System.out.println("caller method continues");

	}

	public static void div(int a)
	{
	    System.out.println(a/2);
	    System.out.println(a/0);
		System.out.println("called method continues");
	}

}
