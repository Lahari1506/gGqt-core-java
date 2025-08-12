package basiccodes;
import java.util.Scanner;

public class VowelsAndConsonantsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String :");
		String str=sc.nextLine();
		int vow_count=0;
		int cons_count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'||str.charAt(i)=='U') {
				vow_count++;
			}else {
				cons_count++;
			}
		}
		System.out.println("vowel count :"+vow_count);
		System.out.println("consonant count :"+cons_count);
	}

}
