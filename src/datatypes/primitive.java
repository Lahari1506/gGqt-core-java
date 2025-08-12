package datatypes;
import java.util.Scanner;
public class primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte data");
		byte b=sc.nextByte();
		System.out.println("Byte data="+b);
		System.out.println("--------");
		System.out.println("enter the short data");
		short s= sc.nextShort();
		System.out.println("Short data="+s);
		System.out.println("--------");
		System.out.println("enter the Integer data");
		int i=sc.nextInt();
		System.out.println("Integer data="+i);
		System.out.println("--------");
		System.out.println("enter the long data");
		long l=sc.nextLong();
		System.out.println("long data="+l);
		System.out.println("--------");
		System.out.println("enter the Float data");
		float f=sc.nextFloat();
		System.out.println("Float data="+f);
		System.out.println("--------");
		System.out.println("enter the double data");
		double d=sc.nextDouble();
		System.out.println("Double data="+d);
		System.out.println("--------");
		System.out.println("enter the String ");
		String str =sc.nextLine();
		System.out.println("String data="+str);
		System.out.println("--------");
		sc.close();

	}

}
