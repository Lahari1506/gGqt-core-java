package Arrays;
import java.util.Scanner;

class Array4{
	 Scanner sc= new Scanner(System.in);
	 String arr[][];
	 void createArray() {
		 System.out.println("enter class count");
		 int cl=sc.nextInt();
		
		 arr=new String[cl][];
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("enter Student count for each class" +(i+1));
			 arr[i]=new String[sc.nextInt()];
		 }
		 System.out.println("Array is created");
		 System.out.println("-------------------------");
	 }
	 void collectData() {
		 for (int i=0;i<arr.length;i++) {
			 System.out.println("inside class number"+(i+1));
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.println("enter name of the student no:"+(j+1));
				 arr[i][j]=sc.next();
			 }
		 }
		 System.out.println("Data collected");
		 System.out.println("---------------------------");
	 }
	 void displayData() {
		 for (int i=0;i<arr.length;i++) {
			 System.out.println("inside class number"+(i+1));
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.println("enter name of the student no:"+(j+1)+" is "+arr[i][j]);
				 
			 }
		 }
System.out.println("-------------------------------");
	 }
 }
public class DifferentStudentDataArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array4 cn=new Array4();
	  cn.createArray();
	  cn.collectData();
	  cn.displayData();
	  

	}

}
