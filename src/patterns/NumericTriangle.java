package patterns;
import java.util.Scanner;
public class NumericTriangle {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int n=sc.nextInt();
	//int count=0;
	for(int i=0;i<n;i++) {
		for(int j=n;j>=i;j--)
		{
			System.out.print("  ");
			}
		for(int j=i;j>=0;j--) 
		{
			
				System.out.print(j+" ");
			}
		for(int j=1;j<=i;j++) {
			
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
	
	
	}

}
