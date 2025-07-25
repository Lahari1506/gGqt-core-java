import java.util.Scanner;
public class pattern1010 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j%2==0 ^ i%2==0) {
					System.out.print("0"+" ");
					
				}else {
					System.out.print("1"+" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
