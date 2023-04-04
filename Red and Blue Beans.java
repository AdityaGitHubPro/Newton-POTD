Question Link: https://my.newtonschool.co/playground/code/0cliocd9fsj9



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long b = sc.nextLong();
        long d = sc.nextLong();
        if (b > r) {
            long temp = r;
            r = b;
            b = temp;
        }
        long packets = (long) Math.ceil((double) r / (double) (b + 1));
        if ((r - packets * b) <= d * packets) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
