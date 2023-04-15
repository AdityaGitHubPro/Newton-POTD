import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of chocolate bars
        int l = sc.nextInt(); // Lowest acceptable price of a chocolate
        int r = sc.nextInt(); // Highest acceptable price of a chocolate
        int k = sc.nextInt(); // Divan's total budget
        int[] prices = new int[n]; // Prices of chocolate bars

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices); // Sort the prices array in ascending order

        int count = 0; // Counter for number of chocolate bars bought
        int i = 0; // Index of chocolate bar

        // Iterate through the sorted prices array
        while (i < n && k > 0) {
            if (prices[i] >= l && prices[i] <= r && prices[i] <= k) {
                // If the price of the chocolate bar is within the acceptable range
                // and within Divan's budget, buy it
                count++;
                k -= prices[i];
            }
            i++;
        }

        System.out.println(count); // Print the count of chocolate bars bought
    }
}
