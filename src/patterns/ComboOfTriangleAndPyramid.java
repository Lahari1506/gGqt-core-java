package patterns;

import java.util.Scanner;
public class ComboOfTriangleAndPyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				//if(i==0||i==(n-1)||j==0||j==(n-1)) {
					System.out.print(" - ");
				//}
				//else {
				//	System.out.print(" ");
				//}
				
			}
			for(int j=0;j<(2*i-1);j++) {
				System.out.print(i+" ");
			}
			System.out.println( );
		}

	}

}
