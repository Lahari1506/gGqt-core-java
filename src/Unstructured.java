import java.util.Scanner;
public class Unstructured{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("nter the Students count:");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Marks of student " +(i+1)+ " is");
			arr[i]=in.nextInt();
		}//System.out.print("-------------------");
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The marks of studnet of "+(i+1)+" is " +arr[i]);
		}
		

	}

}