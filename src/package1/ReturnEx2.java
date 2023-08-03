package package1;

public class ReturnEx2 {

	public static void main(String[] args) {
		int phy=85;
		int mat=98;
		int chem=88;
		int sum=add(phy,mat,chem);
		perc(sum);

	}
	public static int add(int a,int b,int c)
	{
		int sum=(a+b+c);
		return sum;
	}
	public static void perc(int sum)
	{
		int p=sum*100/300;
		System.out.println(sum);
		System.out.println(p);
	}

}
