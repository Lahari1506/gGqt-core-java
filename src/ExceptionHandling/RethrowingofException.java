package ExceptionHandling;
import java.util.Scanner;
class Operations1{
	Scanner in=new Scanner(System.in);
	void function1() throws Exception
	{
		System.out.println("Inside Function-1");
		Scanner in=new Scanner(System.in);
		System.out.println("Division Operation");
		System.out.println("Enter the first number ");
		int n1=in.nextInt();
		System.out.println("Enter the 2nd number ");
		int n2=in.nextInt();
		int res=n1/n2;
		System.out.println(res);
		System.out.println("Outoff Function");
		
	}
}
class Operations2
{
	void function2() throws Exception
	{
		System.out.println("Inside function-2");
		Operations1 op1=new Operations1();
		op1.function1();
	}
}
class Operations3 
{
	void function3() throws Exception
	{
		System.out.println("Inside Function-3");
		Operations2 op2=new Operations2();
		try {
			op2.function2();
		} catch (Exception e) {
			System.out.println("exception handled in function 3");
			throw e;
		}
		System.out.println("outoff function-3");
	}
}
public class RethrowingofException
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main function");
		Operations3 op3=new Operations3();
		try {
			op3.function3();
		}
		catch(Exception e) {
			System.out.println("exception handled in main");
		}
		
	}

}