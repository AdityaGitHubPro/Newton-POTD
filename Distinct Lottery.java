Question Link: https://my.newtonschool.co/playground/code/fd2ueljnzzgk



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            set.add(s);
        }
        System.out.println(set.size());
    }
}
