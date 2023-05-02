import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxD = 0;
        while (n > 0) {
            
            int currD = n % 10;

            if (currD > maxD) {
                maxD = currD;
            }
            n /= 10;
        }
        System.out.println(maxD);
    }
}
