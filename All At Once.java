Question Link: https://my.newtonschool.co/playground/code/th9wahse641i



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if (sum % n != 0) {
            System.out.println("No");
            return;
        }
        int target = sum / n;
        for (int i = 0; i < n; i++) {
            if (Math.abs(a[i]-target) % (n-1) != 0) {
            System.out.println("No");
            return;
            }
        }
        System.out.println("Yes");
    }
}
