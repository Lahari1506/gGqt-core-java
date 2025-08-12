package patterns;
import java.util.Scanner;
public class patternnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<=n;i++) {
			count=count+1;
			for(int j=i ;j<=n;j++) {
				System.out.print(count+"  ");
				count++;
			}
			System.out.println();
		}
		
	}

}
