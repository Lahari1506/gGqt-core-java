package Arrays;

import java.util.Scanner;

class Array9{
	Scanner sc=new Scanner (System.in);
	String arr[][][];
	long revenue;
	long medicalfee;
	long engineeringfee;
	long degreefee;

			void createArray(){
		System.out.println("enter college count:");
		int c=sc.nextInt();
		arr=new String[c][][];
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("enter Class count in college: "+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("class count"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter student count in class : "+(j+1));
				arr[i][j]=new String[sc.nextInt()];
				//int clg=sc.nextInt();
					
			}
			
		}
System.out.println("Array created");
System.out.println("------------------------");
		
	}
	void CollectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside College:" +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside Class:" +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter student Name:" +(k+1));
					arr[i][j][k]=sc.next();
					System.out.println("enter anual investment :" +(k+1));
					arr[i][j][k]=sc.next();
					if(i==0) {
						revenue=revenue+2500000;
					}
					else if(i==1) {
						revenue=revenue+350000;
					}
					else {
						revenue=revenue+80000;
					}
				
				}
		
			}
			System.out.println("Data collected");
			System.out.println("------------------------");
		}
	}
	
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside College:" +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside Class:" +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter student Name:" +arr[i][j][k]);
					//arr[i][j][k]=sc.next();
					System.out.println("enter anual investment :" +(k+1));
					arr[i][j][k]=sc.next();
				}
			}
			System.out.println("Data displayed");
			System.out.println("------------------------");
		}
		System.out.println("Total revenue generated : "+revenue);

	}
	}

public class Array3D3 {

	public static void main(String[] args) {
		
	Array9 a=new Array9();
	a.createArray();
	a.displayData();
	a.CollectData();
	//a.profitandLossData();
	}

}


