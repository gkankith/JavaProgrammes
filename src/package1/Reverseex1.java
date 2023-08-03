package package1;



public class Reverseex1 {

	public static void main(String[] args) {
		
	String a="ankith";
	String b="";

		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);

	}

}
