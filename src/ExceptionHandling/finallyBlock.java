package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finallyBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Division Operation");
			System.out.println("Enter the first number : ");
			int n1 = sc.nextInt();//critical statement -- InputMismatchException
			System.out.println("Enter the second number : ");
			int n2 = sc.nextInt();//critical statement -- InputMismatchException
			int res = n1 / n2;//critical statement -- ArithmeticException
			System.out.println(res);
			System.out.println("-----------------");
			System.out.println("Array Operation");
			System.out.println("Enter the array size : ");
			int size = sc.nextInt();//critical statement -- InputMismatchException
			int arr[] = new int[size];//critical statement -- NegativeArraySizeException
			System.out.println("Enter the value to be added : ");
			int val = sc.nextInt();//critical statement -- InputMismatchException
			System.out.println("Enter the position into which value has to be added : ");
			int pos = sc.nextInt();//critical statement -- InputMismatchException
			arr[pos] = val;//critical statement -- ArrayIndexOutOfBoundsException
			System.out.println("value added");
		}
		//specific catch
		catch(InputMismatchException | ArithmeticException e) {
			System.out.println("InputMismatchException generated and handled or " + "Arithematic exception generated and handled .");
		}
		catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException aie ) {
			System.out.println("Exception Occured and handled in catch block or "+ "negative array size exception generated and handled .");
		}
		//generic catch
		catch (Exception e) {
			System.out.println("Exception Occured and handled in catch block.");
		}
		finally {
			sc.close();
			System.out.println("Scanner class closed");
		}
	}
}