Question Link: https://my.newtonschool.co/playground/code/36u983hln9po



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maximumPeople = x * 4 + y * 7;
        System.out.println(maximumPeople);
    }
}
