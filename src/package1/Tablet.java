package package1;

public class Tablet 
{
	String brand;
	int price;
	String mg;
	
	public Tablet(String brand,int price,String mg)
	{
		this.brand=brand;
		this.price=price;
		this.mg=mg;
	}
  public String toString()
  {
	  return brand+" "+price+" "+mg;
  }

	public static void main(String[] args)
	{
		Tablet a[]=new Tablet[3];
		
		Tablet t1=new Tablet("cipla",120,"650mg");
		Tablet t2=new Tablet("apt",220,"850mg");
		Tablet t3=new Tablet("aceton",60,"250mg");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		

	}

}
