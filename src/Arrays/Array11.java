package Arrays;
public class Array11 {

    public static void main(String[] args) {
        int[] a = {5, 7, 9, -2, 5};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum = sum + a[i];
            }
        }

        System.out.print("the sum of positive element in array is " + sum);
    }
}