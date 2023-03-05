Question Link: https://my.newtonschool.co/playground/code/wrjr86izqkul



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = Math.max(0, b - a + 1);
        System.out.println(count);
    }
}
