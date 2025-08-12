package Arrays;
import java.util.Scanner;

class Array5{
	Scanner sc=new Scanner(System.in);
	String arr[][][];
	void CreateArray() {
		System.out.println("Enter School Count");
		int sch=sc.nextInt();
		System.out.println("Enter Class Count in each school: ");
		int cls=sc.nextInt();
		System.out.println("Enter Student Count in each Class: ");
		int stu=sc.nextInt();
		arr= new String[sch][cls][stu];
		System.out.println("Array Created");
		System.out.println("--------------------------");

	}
	void CollectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school number" +(i+1));	
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside class number"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter student Name"+(k+1));
				arr[i][j][k]=sc.next();
			}
			}
		System.out.println("Data collectd");
		System.out.println("-----------");
		
		}
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school number" +(i+1));	
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside class number"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter student name"+(k+1)+" is: "+arr[i][j][k]);
				//arr[i][j]=new String[sc.nextInt()];
			}
			}
		System.out.println("-------------------------------");
	}
}
}
public class Array3D {

	public static void main(String[] args) {
		
	Array5 a=new Array5();
	a.CreateArray();
	  a.CollectData();
	  a.displayData();
	
	}

}

