Question Link: https://my.newtonschool.co/playground/code/9a2eiztfin6s



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int hours = 21 + (K / 60);
        int minutes = (K % 60);

        if (hours > 23) {
            hours = hours % 24;
        }

        System.out.printf("%02d:%02d\n", hours, minutes);
    }
    
}
