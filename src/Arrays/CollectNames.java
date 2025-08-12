package Arrays;
import java.util.Scanner;

class Array3{
	 Scanner sc= new Scanner(System.in);
	 String arr[][];
	 void createArray() {
		 System.out.println("enter class count");
		 int cl=sc.nextInt();
		 System.out.println("enter Student count for each class");
		 int stu=sc.nextInt();
		 arr=new String[cl][stu];
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
public class CollectNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 cn=new Array3();
	  cn.createArray();
	  cn.collectData();
	  cn.displayData();
	  

	}

}
