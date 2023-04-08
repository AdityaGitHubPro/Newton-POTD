Question Link: https://my.newtonschool.co/playground/code/j39vy9r859q2



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String newS = s.substring(0, i) + s.substring(i+1);
            if (isPalindrome(newS)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
}
