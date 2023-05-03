import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        if (n % 2 != 0) {
            System.out.println("No");
        } 
        else {
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(i + n / 2)) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
