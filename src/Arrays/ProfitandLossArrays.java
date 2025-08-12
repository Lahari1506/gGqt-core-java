/*import java.util.Scanner;

class Array8{
	Scanner sc=new Scanner(System.in);
	String arr[][][];
	 static String[] languages = {"Telugu", "Kannada", "Hindi"};
	void CreateArray() {
		System.out.println("Enter no of movies");
		int m=sc.nextInt();
		System.out.println("enter no of categories in each  movie: ");
		int c=sc.nextInt();
		System.out.println("Enter no of languages in each category: ");
		int l = languages.length;
		arr= new String[m][c][l];
		System.out.println("Array Created");
		System.out.println("--------------------------");

	}
	void CollectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside movie number" +(i+1));	
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside category number"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				//int l = languages.length;
				//System.out.println("Enter language Name"+(k+1));
				arr[i][j][k]=languages[k];
			}
			}
		System.out.println("Data collectd");
		System.out.println("-----------");
		
		}
	}
	void profitandLossData() {
		int investment = 100; // fixed investment (in Crores)
		int previousYearProfit = 80; // last year profit (in Crores)

		System.out.println("Enter this year's total income (in Crores):");
		int income = sc.nextInt();

		if (income > investment) {
			int profit = income - investment;
			System.out.println("Got PROFIT of ₹" + profit + " Crores.");

			if (profit > previousYearProfit) {
				System.out.println("This year's profit increased by ₹" + (profit - previousYearProfit) + " Crores compared to last year.");
			} else if (profit < previousYearProfit) {
				System.out.println("This year's profit decreased by ₹" + (previousYearProfit - profit) + " Crores compared to last year.");
			} else {
				System.out.println("Profit is the SAME as last year.");
			}

		} else if (income < investment) {
			int loss = investment - income;
			System.out.println("Got LOSS of ₹" + loss + " Crores.");
			System.out.println("Compared to last year, there is a LOSS of ₹" + (previousYearProfit + loss) + " Crores.");
		} else {
			System.out.println("No profit, no loss this year.");
			System.out.println("Compared to last year, profit dropped by ₹" + previousYearProfit + " Crores.");
		}

		System.out.println();
	}

	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside movie number" +(i+1));	
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside category number"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println(" language name"+(k+1)+" is: "+arr[i][j][k]);
				//arr[i][j]=new String[sc.nextInt()];
			}
			}
		System.out.println("-------------------------------");
	}
		System.out.println( );
}
}
public class ProfitandLossArrays {

	public static void main(String[] args) {
		
	Array8 a=new Array8();
	a.CreateArray();
	  a.CollectData();
	 
	  a.displayData();
	a.profitandLossData();
	}

}*/
package Arrays;

import java.util.Scanner;

class Array8{
	Scanner sc=new Scanner(System.in);
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	void CreateArray() {
		System.out.println("Enter no of movies");
		int m=sc.nextInt();
		System.out.println("enter no of categories in each  movie: ");
		int c=sc.nextInt();
		System.out.println("Enter no of languages in each category: ");
		int l = sc.nextInt();
		
		arr= new long[m][c][l];
		System.out.println("Array Created");
		System.out.println("--------------------------");

		System.out.println("enter total investment");
		 investment=sc.nextLong();
		 System.out.println("enter previous year profit ");
		 prev_profit=sc.nextLong();
		 System.out.println("--------------------------");
	}
	void CollectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside lnguage number" +(i+1));	
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside category number"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
			System.out.println("Enter revenue of movie no"+(k+1));
				arr[i][j][k]=sc.nextLong();
				sum_revenue+=arr[i][j][k];
			}
			}
		System.out.println("Data collectd");
		System.out.println("-----------");
		
		}
	}
	void profitandLossData() {
		//int investment = 100; // fixed investment (in Crores)
		//int previousYearProfit = 80; // last year profit (in Crores)

		//System.out.println("Enter this year's total income (in Crores):");
		//int income = sc.nextInt();

		if (sum_revenue > investment) {
			long profit = sum_revenue - investment;
			System.out.println("Got PROFIT of ₹" + profit + " Crores.");

			if (profit > prev_profit) {
				System.out.println("This year's profit increased by ₹" + (profit - prev_profit) + " Crores compared to last year.");
			} else if (profit < prev_profit) {
				System.out.println("This year's profit decreased by ₹" + (prev_profit- profit) + " Crores compared to last year.");
			} else {
				System.out.println("Profit is the SAME as last year.");
			}

		} else if (sum_revenue < investment) {
			long loss = investment - sum_revenue;
			System.out.println("Got LOSS of ₹" + loss + " Crores.");
			System.out.println("Compared to last year, there is a LOSS of ₹" + (prev_profit + loss) + " Crores.");
		} else {
			System.out.println("No profit, no loss this year.");
			System.out.println("Compared to last year, profit dropped by ₹" + prev_profit + " Crores.");
		}

		System.out.println();
	}

	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language number" +(i+1));	
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside category number"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println(" ovral revenue "+(k+1)+" is: "+arr[i][j][k]);
				//arr[i][j]=new Long[sc.nextInt()];
			}
			}
		System.out.println("-------------------------------");
	}
		System.out.println( );
}
}
public class ProfitandLossArrays {

	public static void main(String[] args) {
		
	Array8 a=new Array8();
	a.CreateArray();
	  a.CollectData();
	 
	  a.displayData();
	a.profitandLossData();
	}

}


