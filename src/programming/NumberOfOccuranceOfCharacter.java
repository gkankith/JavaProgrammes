package programming;

public class NumberOfOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		String counted=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(counted.indexOf(ch)==-1)
			{
				int count =0;
				for(int j=0;j<s.length();j++)
				{
					char k=s.charAt(j);
					if(k==ch)
						count++;
				}
				System.out.println(ch+" is occured for "+count+" number of times");
				counted=counted+ch;
			}
		}
		
	}

}
