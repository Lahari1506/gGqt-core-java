import java.util.Scanner;
public class TriangleAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(i=0;i<n;i++)
		{
			//char c=(char)('A'+i);
			for(j=n-1;j>i;j--)
				System.out.print("  ");
			char c;
				for(j=0;j<=i;j++)
				{
					c=(char)('A'+i-j);
						System.out.print(c +" ");
				}
				for(j=1;j<=i;j++)
				{
					c=(char)('A'+j);
					System.out.print(c+ " ");
				}
			System.out.println();
		}
	}
}