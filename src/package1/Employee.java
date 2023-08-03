package package1;

public class Employee {
	int eid;
	double salary;
	String name;
	String designation;
	
	public Employee(int eid,double salary,String name,String designation)
	{
		this.eid=eid;
		this.salary=salary;
		this.name=name;
		this.designation=designation;
	}

	public static void main(String[] args) 
	{
		Employee a=new Employee(123,500000d,"Ankith","CEO");
		Employee b=new Employee(321,500000d,"AmruthaAnkith","general Manager");
		Employee c=new Employee(333,300000d,"Ankith","head");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		

	}
	public boolean equals(Employee ob)
	{
		if(this.eid==ob.eid)
			return true;
		else
			
			return false;
	}
	public String toString()
	{
		return eid+" "+name+" "+salary+" "+designation;
	}

}
