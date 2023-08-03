package package1;

public class ObjArrEx2 {
String brand;
String model;
int price;
String category;
String color;

public ObjArrEx2(String brand,String model,int price,String category,String color)
{
	this.brand=brand;
	this.model=model;
	this.price=price;
	this.category=category;
	this.color=color;
}
public String toString()
{
	return brand+" "+model+" "+price+" "+category+" "+color;
}

	public static void main(String[] args) {
		
		ObjArrEx2 a[]=new ObjArrEx2[4];
		
		ObjArrEx2 w1=new ObjArrEx2("titan","t01",6000,"analog","gold");
		ObjArrEx2 w2=new ObjArrEx2("realme","r01",3000,"smart","black");
		
		ObjArrEx2 m1=new ObjArrEx2("samsung","s9+",45000,"touchscreen","black");
		ObjArrEx2 m2=new ObjArrEx2("iphone","4s",26000,"touchscreen","white");
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(m1);
		System.out.println(m2);
		
		
	}

}
