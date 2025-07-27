import java.util.Scanner;
public class Triangle0123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		for(int i=n;i>1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
				}
				for(int j=n;j<=(2*i-1);j++) {
					System.out.print(i +" ");
				
			}
			System.out.println();
		}
	}

}
