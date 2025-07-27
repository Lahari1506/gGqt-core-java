import java.util.Scanner;
public class combofTriangleAndReverseTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print( i+ " ");
			}
			System.out.println();
		}

		for(int i=2;i<=n;i++) {
			for(int j=n;j>i;j--)
				System.out.print("  ");
			for(int k=0;k<(2*i-1);k++) {
				//char ch=(char)('A'+i);
				System.out.print((i)+" ");
			
			}
			System.out.println("");
		}

		
	}
}


	