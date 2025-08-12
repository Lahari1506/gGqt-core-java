package Arrays;
import java.util.Scanner;
class array6
{
	String arr[][][];
	Scanner in=new Scanner(System.in);
	void createData()
	{
		System.out.println("Enter number of schools: ");
		int scl=in.nextInt();
		//System.out.println("Enter the class count in each: ");
		//int cls=in.nextInt();
		//System.out.println("Enter the student count in each: ");
		//int stu=in.nextInt();
		arr=new String[scl][][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number of classes in school " + (i + 1) + ": ");
			arr[i]=new String[in.nextInt()][];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("class count"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the number of students in class " + (j + 1) + " of school " + (i + 1) + ": ");
				arr[i][j]=new String[in.nextInt()];
			}
		}
		System.out.print("Created an Array");
		System.out.println();
	}
	
	void collectData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside School " + (i + 1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("  Inside Class " + (j + 1));
				//arr[j]=in.nextInt();
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("    Enter name of Student " + (k + 1) + ": ");
					//arr[k]=in.nextInt();
					arr[i][j][k]=in.next();
				}
				
			}
		}
		System.out.println("Data is collected");
		System.out.println(" ");
	}
	void displayData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("School " + (i + 1) + ":");
			System.out.println();
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("  Class " + (j + 1) + ":");
				System.out.println();

				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("    Student " + (k + 1) + ": " + arr[i][j][k]);
					System.out.println();

				}
			}
		}System.out.println("Displayed Data");
		System.out.println();
	}
}
public class Array3D2 {
	public static void main(String[] args) {
		array6 a6=new array6();
		a6.createData();
		a6.collectData();
		a6.displayData();

	}

}