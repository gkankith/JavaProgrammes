nnnnnnpackage package1;

public class EqualsOver {

	public static void main(String[] args)
	{
		String name;
		int age;
		
		public EqualsOver(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
		public static void main(String [] args)
		{
			EqualsOver a=new EqualsOver("sam",25);
			EqualsOver b=new EqualsOver("ram",28);
			System.out.println(a.equals(b));
		}
		public String toString(EqualsOver ob)
		{
			this.age=ob.age;
			
		}

	}

}

