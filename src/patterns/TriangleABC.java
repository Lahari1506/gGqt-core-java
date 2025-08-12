package patterns;
import java.util.Scanner;
public class TriangleABC {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int n=sc.nextInt();
	//int count=0;
	for(int i=0;i<n;i++) {
		for(int j=n;j>=i;j--)
		System.out.print("  ");
		for(int j=i;j>=0;j--) 
		{
		char c=(char)('A'+i-j);
				System.out.print(c+" ");
			}
		for(int j=1;j<=i;j++) {
			char c=(char)('A'+i-j);

			System.out.print(c+" ");
		}
		
		System.out.println();
	}
	}
}
