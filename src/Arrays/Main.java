package Arrays;
import java.util.Scanner;
class Structured {
		int arr[];
		Scanner in=new Scanner(System.in);
		void createArray()
		{
			System.out.print("Enter the students count: ");
			int n=in.nextInt();
			arr=new int[n];
			System.out.println("array Created");
		}
		void collectData()
		{
			for(int i=0;i<arr.length;i++){
			System.out.println("Enter Marks of the student " +(i+1)+ " is ");
			arr[i]=in.nextInt();
			}
		}
		//System.out.print("Data is collected");
		void displayData()
		{
			for(int i=0;i<arr.length;i++)
			{
			System.out.println("Marks of student"+(i+1)+ " is "+arr[i]);
			}
	}

}
public class Main
{
	public static void main(String[] args)
	{
		Structured a=new Structured();
		a.createArray();
		a.collectData();
		a.displayData();
	}
}