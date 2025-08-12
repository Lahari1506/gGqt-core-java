package patterns;
import java.util.Scanner;
public class ConditionalStmtP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j||i==(n-1)||j==0||j==(n-1)) {
					System.out.print(" # ");
				}
				else {
					System.out.print(" _ ");
				}
				
			}
			System.out.println( );
		}

	}

}
