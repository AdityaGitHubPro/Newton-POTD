Question Link: https://my.newtonschool.co/playground/code/dae1o5tku1ay



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int pos = (x-1) % (26*n);
        char c = (char) ('A' + pos/n);

        System.out.println(c);
    }
}
