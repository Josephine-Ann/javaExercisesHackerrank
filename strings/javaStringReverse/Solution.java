import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int j = A.length() - 1;
        boolean isPalindrome = true;
        for (int i = 0; i <= A.length() - 1; i++) {
            String fromFront = A.substring(i,i+1);
            String fromBack = A.substring(j, j+1);
            if (!fromFront.equals(fromBack)) {
                isPalindrome = false;
            }
            j--;
        }
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}



