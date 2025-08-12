package basiccodes;
import java.util.Scanner;

public class ReplaceVowelswithSpecialCharacters2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String :");
		String str=sc.nextLine();
		str=str.toUpperCase();
		String vow_count="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z' ) {
				if(ch=='A') 
				{
				vow_count+="$";
				}
				if( ch=='E') 
				{
				vow_count+="#";
				}
				if( ch=='I') 
				{
				vow_count+="@";
				}
				if( ch=='O') 
				{
				vow_count+="*";
				}
				if( ch=='U') 
				{
				vow_count+="$";
				}
				else {
					vow_count+=ch;
				}
					
			}
			
		}
		System.out.println(vow_count);
}
}
