package string;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("RamaRamesh");
				//length()
		int len=sb1.length();
		System.out.println("length :"+len);
		//charAt()
		char c=sb1.charAt(0);
		System.out.println("character is :"+c);
		
		String str = sb1.toString();
		String str1 =str.concat(" is a great batsman");// Add 2 strings
		System.out.println(str1);
		
		//endsWith()
		boolean sb2=str.endsWith("sh"); 
		System.out.println("endswith :"+sb2);
		
		boolean sb3=str.startsWith("sh"); 
		System.out.println("startswith :"+sb2);
		
		Class class1=str.getClass();
		System.out.println(class1);
		
		int hashcode=str.hashCode();
		System.out.println(hashcode);
		
		

	}

}
