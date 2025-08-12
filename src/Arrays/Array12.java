package Arrays;
public class Array12 {

    public static void main(String[] args) {
        int[] a = {-4, 8, -2, 9, 10};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum = sum + a[i];
            }
        }

        System.out.print("the sum of all negative elements in array is " + sum);
    }
}