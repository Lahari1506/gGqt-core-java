import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (height of the middle row): ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = n; s > i; s--) {
                System.out.print("  ");
            }

            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int s = n; s > i; s--) {
                System.out.print("  ");
            }

            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}