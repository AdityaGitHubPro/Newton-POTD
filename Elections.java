import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        long mx = Math.max(a, Math.max(b, c));
        long x = 0, y = 0, z = 0;
        
        if (a != mx) {
            x = Math.abs(mx - a) + 1;
        }
        if (b != mx) {
            y = Math.abs(mx - b) + 1;
        }
        if (c != mx) {
            z = Math.abs(mx - c) + 1;
        }
        
        System.out.println(x + " " + y + " " + z);
    }
}
