import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] l = new int[3];
        for(int i=0; i<3; i++)
            l[i] = sc.nextInt();

        boolean ans = false;

        for(int i=0; i<3; i++)
            if (l[i] == l[(i+1)%3] + l[(i+2)%3])
                ans = true;

        for(int i=0; i<3; i++)
            if (l[i]%2 == 0 && l[(i+1)%3] == l[(i+2)%3])
                ans = true;

        System.out.println(ans ? "Yes" : "No");
        sc.close();
    }
}
