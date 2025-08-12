package patterns;
import java.util.Scanner;
public class new2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int a=1;
		for (int i=0;i<=n;i++) {
			for(int j=1 ;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
	}

}
