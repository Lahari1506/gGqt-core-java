package basiccodes;
import java.util.Scanner;

public class VowAndConCapitalAndSmallCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String :");
		String str=sc.nextLine();
		int Cap_vow_count=0;
		int low_vow_count=0;
		int Cap_cons_count=0;
		int low_cons_count =0;
	//	str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'||str.charAt(i)=='U') {
				Cap_vow_count++;
			}
			else {
				Cap_cons_count++;
			}
			}
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u') {
				low_vow_count++;
			}
			else {
				low_cons_count++;
			}
		
			}}
		System.out.println("capital vowel count :"+Cap_vow_count);
		System.out.println(" small consonant count :"+low_vow_count);
		System.out.println("cap vowel count :"+Cap_cons_count);
		System.out.println("small consonant count :"+low_cons_count);

	
		}
	}
//==}

