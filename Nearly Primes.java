import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 2; i <= n; i++) {
            int fact = 0;

            for (int j = 2; j <= i; j++) {

                if (i % j == 0 && isPrime(j)) {
                    fact++;
                    if (fact > 2) {
                        break;
                    }
                }
            }
            if (fact == 2) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
