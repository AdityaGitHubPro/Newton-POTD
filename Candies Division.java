import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] candies = new int[n]; 

        int tw = 0; 
        int count = 0; 

        
        for (int i = 0; i < n; i++) {

            candies[i] = sc.nextInt(); 
            // tw += candies[i];
            
            if (candies[i] == 1) {
                tw++;
            }
            else{
                count++;
            }
        }

        if(tw==0 && count%2==1){
            System.out.println("No");
        }
        else if((count%2==0 && tw%2==0) || (count%2==1 && tw%2==0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        

    }
}
