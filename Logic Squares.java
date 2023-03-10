Question link: https://my.newtonschool.co/playground/code/00zoabd7yxby


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        
        // Shift the array to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = '0'; // The person in the rightmost square disappears
        
        // Print the result
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
