Questionn Link: https://my.newtonschool.co/playground/code/eow5soix1ouw



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int lastTwoDigits = N % 100;
        System.out.printf("%02d\n", lastTwoDigits);
    }
}
