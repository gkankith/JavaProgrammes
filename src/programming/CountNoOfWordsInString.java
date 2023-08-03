package programming;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" hello welcome to IT company ankith ";
		//s=s.trim();
		String rev=" ";
		String temp=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			temp=temp+ch;
			if(ch==' '&& i==s.length()-1)
			{
				if(i==s.length()-1)
					rev=temp+" "+rev;
				else
					rev=temp+rev;
				temp=" ";
			}
			
		}
		System.out.println(rev);

	}

}
