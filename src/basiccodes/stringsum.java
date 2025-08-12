package basiccodes;
import java.util.Scanner;

public class stringsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String :");
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum=sum + str.charAt(i);
		}
		System.out.println(sum);

	}
	

}
