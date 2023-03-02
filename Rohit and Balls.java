Question Link: https://my.newtonschool.co/playground/code/81q3doymiyu4


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int ans = N - A + B; 
        System.out.println(ans);

    }
}
