package matrix;
import java.util.Scanner;
public class MultiplicationMatrix {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int arr[][];
	//int matrix[][];
	System.out.println("enter row elements");
	int row=sc.nextInt();
	System.out.println("enter column elements");
	int column =sc.nextInt();
	 if (column != row) {
         System.out.println("Matrix multiplication not possible. Columns of Matrix 1 must equal rows of Matrix 2.");
         return;
     }

	
	int[][] matrix1=new int[row][column];
	int[][] matrix2=new int[row][column];
    int[][] MulMatrix = new int[row][column];
	
	
		System.out.println("enter matrix elements1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				   System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix1 [i][j] = sc.nextInt(  );
			
		}
		
	}
		System.out.println("enter matrix elements 2");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				   System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix2 [i][j] = sc.nextInt(  );
			
		}
		
	}
	
		System.out.println("The multiple matrix is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				MulMatrix[i][j]+= (matrix1[i][j] * matrix2[i][j]);
			}
			 System.out.println();
			}
		//System.out.println("The matrix is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				  System.out.print(MulMatrix[i][j] + " ");
			}
			 System.out.println();
			}
		sc.close();
		
}


	}

