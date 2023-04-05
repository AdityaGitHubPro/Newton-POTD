Question Link: https://my.newtonschool.co/playground/code/v25v0omtcvnn


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if (N % 2050 != 0) {
            System.out.println("-1");
            return;
        }
        long x = N / 2050;
        int count = 0;
        while (x > 0) {
            count += x % 10;
            x /= 10;
        }
        System.out.println(count);
    }
}
