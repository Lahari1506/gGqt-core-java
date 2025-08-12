package patterns;
import java.util.Scanner;

public class Pattern43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }

            // Calculate starting character (odd positions in alphabet)
            char ch = (char) ('A' + 2 * i);

            // Print characters in descending order
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print((char)(ch - j) + " ");
            }

            System.out.println();
        }
    }
}