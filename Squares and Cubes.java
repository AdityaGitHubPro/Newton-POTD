Question Link: https://my.newtonschool.co/playground/code/2sc56z278c6k



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = a + a*a + a*a*a;
        System.out.println(ans);
    }
}
