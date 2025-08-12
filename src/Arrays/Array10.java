package Arrays;
public class Array10 {

    public static void main(String[] args) {
        int[] n = {6, 5, 7, 5, 6};
        int left = 0;
        int right = (n.length - 1);
        boolean ispalindrome = true;

        while (left < right) {
            if (n[left] != n[right]) {
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (ispalindrome) {
            System.out.print("is palindrome");
        } else {
            System.out.print("is not palindrome");
        }
    }
}