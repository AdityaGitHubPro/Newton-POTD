Question Link: https://my.newtonschool.co/playground/code/6po5bv14h8w1



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
