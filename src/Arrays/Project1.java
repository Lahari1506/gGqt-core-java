package Arrays;
import java.util.Scanner;
class Array7{
	Scanner sc=new Scanner(System.in);
	String arr[][][];
	void createData()
	{
		System.out.println("enter no.of movies");
		int m=sc.nextInt();
		
		arr= new String[m][][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter no.of categories for each movie" +(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("enter no.of Languages for each Categories" +(i+1));
				for(int j=0;j<arr[i].length;j++) 
				{
					System.out.println("enter no of the languages in each category" +(j+1));
					arr[i][j]=new String[sc.nextInt()];
				}
			}
			System.out.print("Created an Array");
			System.out.println(" -------------------------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the movies"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the categories"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the language name"+(k+1));
					arr[i][j][k]=sc.next();
			}
		}
		}
			System.out.print("data was collected");
			System.out.println("-------------------------------");
	}
		void displayData() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("inside the movies"+(i+1)+ "is: "+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("inside the categories"+(j+1)+ "is: "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("inside the categories"+arr[i][j][k]);
						System.out.println();
				}
			}
			}
				System.out.print("data was displayed");
				System.out.println("-------------------------------");
}
}
public class Project1 {

	public static void main(String[] args) {
		Array7 a=new Array7();
		a.createData();
		a.collectData();
		a.displayData();
		
		// TODO Auto-generated method stub

	}

}
