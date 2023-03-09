Questionn Link: https://my.newtonschool.co/playground/code/cowhep65t5r9




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % k == 0 || b % k == 0) {
            // If either A or B is a multiple of K, then OK
            System.out.println("OK");
        } else if (a / k < b / k) {
            // If the floor division of A/K is less than B/K, then there exists a multiple of K within the range [A, B]
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        sc.close();
    }
}
