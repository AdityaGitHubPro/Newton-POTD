Question Link: https://my.newtonschool.co/playground/code/mv1upsr2h67b


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class //
// you can add inner classes if needed //
class Main {
    public static int dSum(int N) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % dSum(N) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
