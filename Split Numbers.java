import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] integers = new int[2 * n];

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < 2 * n; i++) {
            integers[i] = sc.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (oddCount != evenCount) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
