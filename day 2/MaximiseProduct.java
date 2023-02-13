import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximiseProduct {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long x = (a * c);
        long y = (b * d);

        long ans = (long) Math.max(x, y);

        System.out.println(ans);
    }
}