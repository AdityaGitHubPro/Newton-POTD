Question Link: https://my.newtonschool.co/playground/code/bivua30yxlz2


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean checkPalindrome(String str,int l,int r){
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    static boolean helper(String str,int l,int r){
        while(l<r){
            if(str.charAt(l)=='a'&&str.charAt(r)=='a'){
                l++;
                r--;
            }
            else break;
        }
        while(l<r&&str.charAt(r)=='a'){
            r--;
        }
        return checkPalindrome(str,l,r);
    } 
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean result=helper(str,0,str.length()-1);
        if(result)System.out.print("Yes");
        else System.out.print("No");
    }
}
