Question Link: https://my.newtonschool.co/playground/code/sanpzsvqdpj7


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int abc = sc.nextInt();
        int x=abc/100;
        int y=(abc/10)%10;
        int z=abc%10;

        int xyz=x*100+y*10+z;
        int bca=y*100+z*10+x;
        int cab=z*100+x*10+y;

        int sum=xyz+bca+cab;

        System.out.println(sum);
    }
}
