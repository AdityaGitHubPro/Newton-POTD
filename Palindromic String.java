Question Link: https://my.newtonschool.co/playground/code/bivua30yxlz2


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
        boolean canBePalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                canBePalindrome = false;
                break;
            }
        }
        if (canBePalindrome) {
            System.out.println("Yes");
        } else {
            String reversedS = new StringBuilder(s).reverse().toString();
            if ((reversedS + s).equals(new StringBuilder(reversedS + s).reverse().toString())) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
