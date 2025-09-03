package ExceptionHandling;
import java.util.Scanner;

class operation1{
	void function1() throws Exception{
		System.out.println("inside function 1");
		Scanner sc=new Scanner (System.in);
		System.out.println("Division operator");
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		int res=n1/n2;
		System.out.println(res);
	System.out.println(res);
	System.out.println(res);
	}
}
public class ThrowException {

}
