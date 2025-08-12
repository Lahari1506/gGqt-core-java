package patterns;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		//int count=1;
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j>1;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				
				System.out.print(i+" ");
				
			}
			System.out.println( );
		}

	}

}
