Question Link: https://my.newtonschool.co/playground/code/3fd1zt795i30



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (s.charAt(n-1) == 'o') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
