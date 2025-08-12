package patterns;
import java.util.Scanner;
public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		//int count=1;
		for(int i=0;i<n;i++) {
			for(int j=n;j>=i;j--)
				System.out.print("  ");
			for(int k=0;k<=i;k++) {
				//char ch=(char)('A'+i);
				
				System.out.print(i+" ");
				//i++;
			
			}
			System.out.println( );
		}

	}

}
