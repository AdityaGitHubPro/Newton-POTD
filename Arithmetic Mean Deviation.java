import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int d = Math.abs(a1 + a3 - a2 - a2);

        if (d % 3 == 0) {
            System.out.println(0);  
        }
        else {
            System.out.println(1);
        }
    }
}
