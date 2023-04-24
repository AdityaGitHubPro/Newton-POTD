import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = N;
        
        while (ans > 9) {
            int sum = 0;
            while (ans > 0) {
                sum += ans % 10;
                ans /= 10;
            }
            ans = sum;
        }
        
        System.out.println(ans);
    }
}
