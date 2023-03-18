Question Link: https://my.newtonschool.co/playground/code/g57genwpgoa9



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << (n - 1)); i++) {
            int cur = 0;
            for (int j = 0, k = 0; j < n; j = k) {
                k = j + 1;
                while (k < n && ((i >> (k - 1)) & 1) == 0) {
                    k++;
                }
                int or = a[j];
                for (int l = j + 1; l < k; l++) {
                    or |= a[l];
                }
                cur ^= or;
            }
            ans = Math.min(ans, cur);
        }
        System.out.println(ans);
    }
}
