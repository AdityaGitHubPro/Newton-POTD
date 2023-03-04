Question Link: https://my.newtonschool.co/playground/code/8pndyg88zi6c



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean possible = false;
        for (int i = 1; i <= 6; i++) {
            if (i <= B && i + 6 * (A - 1) >= B) {
                possible = true;
                break;
            }
        }
        System.out.println(possible ? "Yes" : "No");
        sc.close();
    }
}
