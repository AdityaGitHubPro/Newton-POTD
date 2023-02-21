Question Link: https://my.newtonschool.co/playground/code/st97mwafwj5j


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        if(S.endsWith("er")) {
            System.out.println("er");
        } 
        else if(S.endsWith("ist")) {
            System.out.println("ist");
        }
    }
}
