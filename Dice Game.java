Question Link: https://my.newtonschool.co/playground/code/8pndyg88zi6c



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b % a == 0 || (b - a) % a == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
