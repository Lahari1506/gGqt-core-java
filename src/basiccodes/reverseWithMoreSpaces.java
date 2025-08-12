package basiccodes;
import java.util.Scanner;

public class  reverseWithMoreSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        // Step 1: Remove extra spaces and trim the string
        str = str.trim().replaceAll("\\s+", " "); // replaces multiple spaces with one

        // Step 2: Count spaces (after cleaning)
        int spc_count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spc_count++;
            }
        }

        // Step 3: Calculate word count
        int word_count = spc_count + 1;

        // Step 4: Create array to store reversed words
        String[] arr = new String[word_count];

        // Step 5: Traverse the string from end and store reversed words in array
        int temp = arr.length - 1;
        String temp_str = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                temp_str = temp_str + str.charAt(i);
            } else {
                arr[temp] = temp_str;
                temp--;
                temp_str = "";
            }
        }
        arr[temp] = temp_str; // last word

        // Step 6: Print reversed words
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
