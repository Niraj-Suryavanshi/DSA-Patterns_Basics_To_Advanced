package AdvancedPatterns;

public class diamondPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//lower half
		int n1=4;
		for(int i=n1;i>=1;i--)
		{
			for(int j=1;j<=n1-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
