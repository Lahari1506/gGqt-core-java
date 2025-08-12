package Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize min and max with first element
        int min = arr[0];
        int max = arr[0];

        // Find min and max
        for(int i = 1; i < n; i++) {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        sc.close();
    }
}
