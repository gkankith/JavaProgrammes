package programming;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Karnataka";
		String unique=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(unique.indexOf(ch)==-1)
			{
				unique=unique+ch;
			}
		}
		System.out.println(unique);

	}

}
