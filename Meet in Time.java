Question Link: https://my.newtonschool.co/playground/code/k8akyxeq09cb



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        sc.close();

        if (D <= T * S) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
