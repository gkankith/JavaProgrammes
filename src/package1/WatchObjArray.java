package package1;

public class WatchObjArray {
String brand;
String model;
int price;
String category;
String color;

public WatchObjArray(String brand,String model,int price,String category,String color)
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
		
		WatchObjArray a[]=new WatchObjArray[5];
		
		WatchObjArray w1=new WatchObjArray("Titan","t01",5000,"analog","gold");
		WatchObjArray w2=new WatchObjArray("realme","r01",3500,"digital","black");
		WatchObjArray w3=new WatchObjArray("amazfit","a01",5000,"smart","grey");
		WatchObjArray w4=new WatchObjArray("boat","b01",2500,"smart","black");
		WatchObjArray w5=new WatchObjArray("rado","r01",8000,"digital","blue");
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		

	}

}
