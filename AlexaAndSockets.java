Question link: https://my.newtonschool.co/playground/code/bmqfhzq3zoat


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int stripsNeeded = 0;
        int emptySockets = 1;
        while (emptySockets < b) {
            emptySockets += a - 1; 
            stripsNeeded++;
        }
        System.out.println(stripsNeeded);
    }
}
