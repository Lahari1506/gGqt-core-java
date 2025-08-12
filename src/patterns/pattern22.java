package patterns;
import java.util.Scanner;
public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		//int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("_"+" ");
				//count++;
			}
			for(int k=i;k<=n;k++) {
				System.out.print("#"+" ");
			}
			System.out.println( );
		}
		

	}

}
