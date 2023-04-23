import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long x = sc.nextLong();
        long t = sc.nextLong();

        long s = t / x;

        long s1=0;
        long s2=0;

        s1 = Math.max(0L, n - s);
        if (s == 0)
            System.out.println(0);
        else {
            s = Math.min(s, n);
            s2 = s1 * s + (s * (s - 1) / 2);
            System.out.println(s2);
        }
        sc.close();
    }
}
