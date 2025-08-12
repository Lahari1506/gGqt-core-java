package basiccodes;
import java.util.Scanner;

public class StringProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String :");
		String str=sc.nextLine();
		int mul=1;
		for(int i=0;i<str.length();i++) {
			mul=mul * str.charAt(i);
		}
		System.out.println(mul);
	}

}
