import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y=x & -x;

        while ((y ^ x) == 0 || (y & x) == 0) {
            y++;
        }
        
        System.out.println(y);
    }
}
