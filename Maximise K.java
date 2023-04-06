Questionn Link: https://my.newtonschool.co/playground/code/nr7ugsdijkbm



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = N;
        while ((k & (k-1)) != 0) { 
            k &= k-1;
        }
        System.out.println(k-1);
    }
}
