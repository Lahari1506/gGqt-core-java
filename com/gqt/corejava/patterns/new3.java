import java.util.Scanner;
public class new3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=i ;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
