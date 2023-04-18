import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(int)Math.log10(n);
        int ans=n/(int)Math.pow(10,d)+9*d;
        System.out.println(ans);
    }
}
