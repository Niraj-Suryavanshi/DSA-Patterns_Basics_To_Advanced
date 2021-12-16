package AdvancedPatterns;

public class hollowButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i==3&&j==2) || (i==4&&j==2) || (i==4&&j==3) )
				{
					System.out.print(" ");
				}
				else
				{	
				System.out.print("*");
				}
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if((i==3&&j==2) || (i==4&&j==2) || (i==4&&j==3) )
				{
					System.out.print(" ");
				}
				else
				{	
				System.out.print("*");
				}
			}
			
			System.out.println();
			//lower part start
		}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if((i==3&&j==2) || (i==4&&j==2) || (i==4&&j==3) )
				{
					System.out.print(" ");
				}
				else
				{	
				System.out.print("*");
				}
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if((i==3&&j==2) || (i==4&&j==2) || (i==4&&j==3) )
				{
					System.out.print(" ");
				}
				else
				{	
				System.out.print("*");
				}
			}
			
			System.out.println();
			
			
			
			
		}

	}

}
