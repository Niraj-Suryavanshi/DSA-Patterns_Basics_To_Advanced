package BasicPatterns;

public class patternTopAlignNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//				
//			}
//			System.out.println();
//		}
		int n1=5;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n1-i+1;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		

	}

}
