import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AlexaAndDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            if (N % i == 0 && N / i <= 9) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}