package datatypes; // explicit datatype


public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bi= 126; // implicit
		System.out.println("byte data is="+bi);
		short sh= bi;
		System.out.println("short data is="+sh);
		int in= sh;
		System.out.println("integer data is="+in);
		long lo= in;
		System.out.println("long data is="+lo);

		
		long l= 126;//explicit
		System.out.println("long data is="+l);
		int i= (int)l;
		System.out.println("integer data is="+i);
		short s= (short)i;
		System.out.println("short data is="+s);
		byte b= (byte)s;
		System.out.println("byte data is="+b);
		
		
		


	}

}
