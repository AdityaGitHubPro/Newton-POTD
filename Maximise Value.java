import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Long> a = new ArrayList<Long>();

        for (int i = 0; i < n; i++) {

            long tmp = sc.nextLong();
            
            a.add(tmp);

        }

        long maxPoss = 0;
        for (int i = 1; i < n; i++) {
            maxPoss = Math.max(maxPoss, a.get(i - 1) * a.get(i));
        }
        System.out.println(maxPoss);
    }
}
