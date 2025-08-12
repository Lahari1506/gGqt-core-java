package datatypes;
import java.util.Scanner;
public class nonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter byte data");
		Byte b=new Byte(sc.nextByte());
		System.out.println("byte data="+b);
		System.out.println("----------");
		System.out.println("enter Short data");
		Short s=new Short(sc.nextShort());
		System.out.println("short data="+b);
		System.out.println("----------");
		System.out.println("enter the Integer data");
		Integer i=new Integer(sc.nextInt());
		System.out.println("Integer data="+i);
		System.out.println("--------");
		System.out.println("enter the long data");
		Long l=new Long(sc.nextLong());
		System.out.println("long data="+l);
		System.out.println("--------");
		System.out.println("enter the Float data");
		Float f=new Float(sc.nextFloat());
		System.out.println("Float data="+f);
		System.out.println("--------");
		System.out.println("enter the double data");
		Double d=new Double(sc.nextDouble());
		System.out.println("Double data="+d);
		System.out.println("--------");
		System.out.println("enter the String ");
		String str =new String(sc.next());
		System.out.println("String data="+str);
		System.out.println("--------");
		Boolean bl =new Boolean(true);
		System.out.println("String data="+bl);
		System.out.println("--------");
		sc.close();
		
	}

}
