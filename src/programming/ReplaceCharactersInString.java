package programming;

public class ReplaceCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apple";
		String replace=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char k=s.charAt(j);
				if(ch==k)
					count++;
			}
			if(count>1)
				replace=replace+'$';
			else
				replace=replace+ch;
		}
		System.out.println(replace);

	}

}
