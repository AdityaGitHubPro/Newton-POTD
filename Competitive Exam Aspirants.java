Question Link: https://my.newtonschool.co/playground/code/o2hgx4rh264t


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int U = sc.nextInt();
        int L = sc.nextInt();
        int age = sc.nextInt();
        
        if(age >= L && age <= U) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
