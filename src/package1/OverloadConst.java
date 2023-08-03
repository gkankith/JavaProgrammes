package package1;

public class OverloadConst {
	String name;
	int age;
	long contact;
	String gender;
	public OverloadConst(String name,int age,long contact,String gender)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.gender=gender;
	}
	public OverloadConst(String name,int age,long contact)
	{
		this(name,age,contact,null);
	}
	public OverloadConst(String name,int age)
	{
		this(name,age,0,null);
	}
	

	public static void main(String[] args)
	{
		OverloadConst a=new OverloadConst("sam",24,8762152228l,"male");
		OverloadConst b=new OverloadConst("ram",26,8762162228l);
		OverloadConst c=new OverloadConst("shyam",28);
		a.print();
		b.print();
		c.print();

	}
	public void print()
	{
		System.out.println(name+" "+age+" "+contact+" "+gender);
	}

}
