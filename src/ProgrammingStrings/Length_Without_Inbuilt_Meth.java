package ProgrammingStrings;

public class Length_Without_Inbuilt_Meth {

	public static void main(String[] args) {

		String s="Radhe Radhe";
		int count=0;
		
		for(int i=0;  ;i++)
		{
			try {
				char ch=s.charAt(i);
				count++;

			}
			catch(StringIndexOutOfBoundsException ob)
			{
				break;
			}
		}

		System.out.println(count);
	}
}
