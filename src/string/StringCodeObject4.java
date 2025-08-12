package string;

public class StringCodeObject4 {
	public static void main(String args[]) {
		String s1=new String("RAMA");
		String s2=new String("RAMA");
		String s3=new String("rama");
		String s4=new String("SITA");
		System.out.println("CASE-1: Same string");
		if(s1.equals(s2)==true) {
			System.out.println("Strings Equal");
		}
		else {
			System.out.println("Strings not equal");
		}
		//System.out.println("----------------------------------");
		
		if(s1==s2) {
			System.out.println("References Equal");
		}
		else {
			System.out.println("References not equal");
		}
		System.out.println("----------------------------------");
		
		System.out.println("CASE-2: Same string but case sensitive");
		if(s1.equals(s3)==true) {
			System.out.println("Strings Equal");
		}
		else {
			System.out.println("Strings not equal");
		}
		//System.out.println("----------------------------------");
		
		if(s1==s3) {
			System.out.println("References Equal");
		}
		else {
			System.out.println("References not equal");
		}
		System.out.println("----------------------------------");
		
	
		System.out.println("CASE-3: diff string");
		if(s1.equals(s4)==true) {
			System.out.println("Strings Equal");
		}
		else {
			System.out.println("Strings not equal");
		}
	//	System.out.println("----------------------------------");
		
		if(s1==s4) {
			System.out.println("References Equal");
		}
		else {
			System.out.println("References not equal");
		}
		System.out.println("----------------------------------");
	}
	
	}