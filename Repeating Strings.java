Question Link: https://my.newtonschool.co/playground/code/gwqtmsknr2o9



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = s + s + s;
        System.out.println(ans.substring(0,6));
    }
}
