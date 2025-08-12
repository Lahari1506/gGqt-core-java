package patterns;
import java.util.Scanner;
public class Triangle {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int n=sc.nextInt();
	//int count=1;
	for(int i=0;i<n;i++) {
		for(int j=n-i;j>1;j--)
			System.out.print(" ");
		for(int j=0;j<=i;j++) {
			//if(i%2==0) {
				//System.out.print("");
			//}else {
			System.out.print(" *");//}
			//count++;
		}
		System.out.println( );
	}
	
	
	}

}
