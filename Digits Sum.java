Question Link: https://my.newtonschool.co/playground/code/66ooxnyv1c3f



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumA = sumOfDigits(a);
        int sumB = sumOfDigits(b);
        System.out.println(Math.max(sumA, sumB));
    }
    
    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
