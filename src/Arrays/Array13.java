package Arrays;
public class Array13 {

    public static void main(String[] args) {
        int[] a = {4, 4, 5, 2, 9};
        int product = 1;

        for (int i = 0; i < a.length; i++) {
            product = product * a[i];
        }

        System.out.print("the product of array is " + product);
    }
}