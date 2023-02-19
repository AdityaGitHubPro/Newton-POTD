Question Link: https://my.newtonschool.co/playground/code/8why86mjpg28


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        
        int start = Math.max(x - k + 1, -1000000);
        int end = Math.min(x + k - 1, 1000000);
        
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
