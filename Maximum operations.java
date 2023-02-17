Question Link: https://my.newtonschool.co/playground/code/laj6o2n541o1


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maxOps = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int ops = 0;

            while (num % 2 == 0) {
                num /= 2;
                ops++;
            }

            maxOps = Math.min(maxOps, ops);
        }

        System.out.println(maxOps);
    }
}
