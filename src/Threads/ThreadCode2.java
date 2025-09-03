package Threads;

import java.util.Scanner;
public class ThreadCode2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Addition opeartion is used");
		Scanner in=new Scanner(System.in);
		System.out.println("ENter 1st number: ");
		int num1=in.nextInt();
		System.out.println("ENter 2nd number: ");
		int num2=in.nextInt();
		int res=num1+num2;
		System.out.println("Result: "+res);
		System.out.println("Addition Operation Completed");
		System.out.println("Printing opeartion started");
		for(int i=1;i<10;i++)
		{
			System.out.println("Hapy 6 years to GQT");
			Thread.sleep(3000);
		}
		System.out.println("Printing Operation completed");
		System.out.println("Banking Operation Started");
		System.out.println("Enter the account number: ");
		int accno=in.nextInt();
		System.out.println("Enter the pin number: ");
		int pin=in.nextInt();
		System.out.println("Data Enered");
		System.out.println("Banking Operation COmpleted");
		
	}

}