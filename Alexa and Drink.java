Question Link: https://my.newtonschool.co/playground/code/revw2j9ng00y



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double ans = (a * b) / 100.0;
        System.out.printf("%.2f", ans);
    }
}
