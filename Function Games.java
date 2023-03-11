Question Link: https://my.newtonschool.co/playground/code/yhunou0pamnl



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            int ft = f(t);
            int result = f(f(f(t) + t) + f(ft));
            System.out.println(result);
        }
    }

    public static int f(int x) {
        return x * x + 2 * x + 3;
    }
}
