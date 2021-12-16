package BasicPatterns;

public class oneZeroBitPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum=i+j;
				if(sum%2==0)
				{
					System.out.print("1"+" ");
				}
				else
				{
					System.out.print("0"+" ");
				}
				
			}
			System.out.println();
		}

	}

}
