package basiccodes;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String :");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("the res string is :" +res);
		if(str.equals(res)==true) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
