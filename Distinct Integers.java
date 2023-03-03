Question Link: https://my.newtonschool.co/playground/code/3ac5z255l8m0


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
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        set.add(A);
        set.add(B);
        set.add(C);
        set.add(D);
        set.add(E);

        System.out.println(set.size());
    }
}
