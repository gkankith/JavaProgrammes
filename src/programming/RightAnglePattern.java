package programming;

public class RightAnglePattern {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}