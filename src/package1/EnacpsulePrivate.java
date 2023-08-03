package package1;

public class EnacpsulePrivate {
	String name;
	int age;
	public EnacpsulePrivate(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	private void print()
	{
		System.out.println(name);
		System.out.println(age);
	}

}
