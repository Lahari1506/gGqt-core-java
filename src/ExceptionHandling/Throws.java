package ExceptionHandling;
import java.util.Scanner;
		import java.util.InputMismatchException;
		          class Operation13{
		        	  void function1() throws java.lang.Exception{
		        		  System.out.println("Inside the function-1");
		        		  Scanner sc=new Scanner(System.in);
		        		  System.out.println("Division operation");
		        		  System.out.println("Enter the first number :");
		        		  int n1=sc.nextInt();
		        		  System.out.println("Enter the second number ");
		        		  int n2=sc.nextInt();
		        		  int res=n1/n2;
		        		  System.out.println(res);
		        		  System.out.println("Outoff function-1");
		        	  }
		          }
		          class Operation23{
		        	  void function2() throws java.lang.Exception{
		        		  System.out.println("Inside the function-2");
		        		  Operation13 op1=new Operation13();
		        		  op1.function1();
		        		  System.out.println("outoff function-2");
		        	  }
		          }
		          class Operation333{
		        	  void function3() throws java.lang.Exception{
		        		  System.out.println("Inside function-3");
		        		  Operation23 op2=new Operation23();
		        		  try {
		        			  op2.function2();
		        		  }
		        		  catch(java.lang.Exception e) {
		        			  System.out.println("Exception handled in function-3");
		        			  throw e;
		        		  }
		        		  System.out.println("Outoff function-3");
		        	  }
		          }
		          public class Throws {
		        		public static void main(String[] args){
		        			// TODO Auto-generated method stub
		        			System.out.println("Inside main function");
		        			Operation333 op3=new Operation333();
		        			try {
								op3.function3();
							} catch (java.lang.Exception e) {
							   System.out.println("Exception handled in main");
							
							}
		        			System.out.println("out off main function");
		        		}
		          }