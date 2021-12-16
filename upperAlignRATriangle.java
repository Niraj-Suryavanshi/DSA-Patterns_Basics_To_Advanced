package BasicPatterns;

public class upperAlignRATriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=n;i>=1;i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
