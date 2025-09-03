package ExceptionHandling;

import java.util.Scanner;
class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return "The age is less than the minimum age. Application cannot be processed";
	}
}
class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "The age is more than the maximum age. Application cannot be processed.";
	}
}
class Details
{
	int age;
	void collectData()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=in.nextInt();
	}
	void validate() throws UnderAgeException,OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60)
		{
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Application is processed");
		}
	}
}
class Matrimony
{
	void process(Details d)
	{
		try
		{
			d.collectData();
			d.validate();
		}
		catch(OverAgeException | UnderAgeException e1)
		{
			try
			{
				d.collectData();
				d.validate();
			}
			catch(OverAgeException | UnderAgeException e2)
			{
				try
				{
					d.collectData();
					d.validate();
				}
				catch(OverAgeException | UnderAgeException e3)
				{
					System.out.println("Candidature is Blocked");
					System.exit(0);
				}
			}
		}
	}
}
public class candidate {

	public static void main(String[] args) {
	Details d=new Details();
	Matrimony m=new Matrimony();
	m.process(d);
		
	}

}