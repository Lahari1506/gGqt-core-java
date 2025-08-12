package basiccodes;

public class BuInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SachinRameshTendulkar";
		int length=str.length();// length of the main string
		System.out.println(length);
		
		char c=str.charAt(5);// character at specified position
		System.out.println(c);
		
		String str1 =str.concat(" is a great batsman");// Add 2 strings
		System.out.println(str1);

		boolean res1 =str.contains("Ramesh");// it will check whether the given sting is presented or not
		System.out.println(res1);
		res1 =str.contains(" pamesh");// it will check whether the given sting is presented or not
		System.out.println(res1);
		
		boolean res2 =str.endsWith("kar");// it will check whether the given sting is presented at last or not
		System.out.println(res2);
		res2 =str.endsWith("ten");// it will check whether the given sting is presented or not
		System.out.println(res2);
		
		boolean res3 =str.startsWith("Sachin");// it will check whether the given sting is presented at starting or not
		System.out.println(res3);
		res3 =str.startsWith("sachin");// it will check whether the given sting is presented or not
		System.out.println(res3);
		
		Class Class1=str.getClass();
		System.out.println(Class1);
		
		int hashcode=str.hashCode();
		System.out.println(hashcode);
		
		int indexof=str.indexOf('s');// it will give the index of given charecter in the main string
		System.out.println(indexof);
		
		boolean res4 =str.isBlank();// it will check whether the given sting is Empty or contain spaces
		System.out.println(res4);
		String str2="             ";
		 res4 =str2.isBlank();// it will check whether the given sting is Empty or contain spaces
		System.out.println(res4);
		String str3="";
		 res4 =str2.isBlank();// it will check whether the given sting is Empty or contain spaces
		System.out.println(res4);
		
		boolean res5 =str.isEmpty();// it will check whether the given sting is Empty or not
		System.out.println(res5);
		 res5 =str2.isEmpty();
		System.out.println(res5);
		 res5 =str2.isEmpty();
		System.out.println(res5);
		
		int lastindexof=str.lastIndexOf('s');// it will give the last index of given charecter in the main string
		System.out.println(lastindexof);
		
		String replac=str.replace('S','$');// replace the certain character with another given character
		System.out.println(replac);
		
		String substring=str.substring(6);// it will give char from certain parameter
		System.out.println(substring);
		substring=str.substring(6,12);//print character between the range
		System.out.println(substring);
		
		String UpperCase=str.toUpperCase();// converts the string to uppercases
		System.out.println(UpperCase);
		
		String lowerCase=str.toLowerCase();// converts the string to uppercases
		System.out.println(lowerCase);
		
		
	}

}
