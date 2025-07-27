import java.util.Scanner;
public class diamondOutline {

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter size");
    	int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); 
            }
            System.out.print(i);
            if (i > 1) {
                int spacesBetween = (i - 2) * 4 + 3;
                if (i == 2) { 
                    spacesBetween = 3;
                }
                for (int k = 0; k < spacesBetween; k++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); 
            }
            System.out.print(i);
            if (i > 1) {
                int spacesBetween = (i - 2) * 4 + 3;
                if (i == 2) { 
                    spacesBetween = 3;
                }
                for (int k = 0; k < spacesBetween; k++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}