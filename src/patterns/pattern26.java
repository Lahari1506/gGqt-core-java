package patterns;
import java.util.Scanner;
public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i+1;j--)
				System.out.print("  ");
			for(int k=0;k<=i*2;k++) {
				
				System.out.print( i+" ");
			
			}
			System.out.println( );
		}

	}

}
