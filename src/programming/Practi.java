package programming;

public class Practi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="umbrella";
		String counted="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(counted.indexOf(ch)==-1)
			{
			count++;
			}
			counted=counted+ch;
		}
		System.out.println(count);
	}

}
