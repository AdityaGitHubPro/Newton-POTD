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
        int c = sc.nextInt();

        if (b >= Math.min(a, c) && b <= Math.max(a, c)) {
            System.out.println("Yes");
        }
         else {
            System.out.println("No");
        }
    }
}
