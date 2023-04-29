import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sb = 0;

        for (int i : arr) {

            int s = (int)Math.sqrt(i);
            
            if (s*s != i) {
                f = 1;
                break;
            }
        }
        System.out.println(f == 0 ? "No" : "Yes");
    }
}
