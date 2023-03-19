Question Link: https://my.newtonschool.co/playground/code/f9cri4xdmixm



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = Integer.parseInt(a + "" + b); 
        int sqrt = (int) Math.sqrt(num); 
        if (sqrt * sqrt == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
