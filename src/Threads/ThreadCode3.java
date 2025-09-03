package Threads;

import java.util.Scanner;

class Addition
{
	void add()
	{
	System.out.println("Addition opeartion is used");
	Scanner in=new Scanner(System.in);
	System.out.println("ENter 1st number: ");
	int num1=in.nextInt();
	System.out.println("ENter 2nd number: ");
	int num2=in.nextInt();
	int res=num1+num2;
	System.out.println("Result: "+res);
	System.out.println("Addition Operation Completed");
	}
}
class Banking
{
	void bank()
	{
		System.out.println("Printing Operation completed");
		Scanner in=new Scanner(System.in);
		System.out.println("Banking Operation Started");
		System.out.println("Enter the account number: ");
		int accno=in.nextInt();
		System.out.println("Enter the pin number: ");
		int pin=in.nextInt();
		System.out.println("Data Enered");
		System.out.println("Banking Operation COmpleted");
	}
}
class loop
{
	void print()
	{
		System.out.println("Printing opeartion started");
		for(int i=1;i<10;i++)
		{
			System.out.println("Hapy 6 years to GQT");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing opeartion started");
	}
}
public class ThreadCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.add();
		loop l=new loop();
		l.print();
		Banking b=new Banking();
		b.bank();

	}

}
