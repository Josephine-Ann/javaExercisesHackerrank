import java.util.Scanner;

public class Solution {
    public static boolean isGreaterGreater(String greater, String lesser) {
        return greater.compareTo(lesser) > 0;
    }
    public static boolean isStringEmpty(String str) {
        return str.length() == 0;
    }
    
    public static boolean isStringFeasible(int i, int lengthStr, int k) {
        return i + k <= lengthStr;
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i<= s.length()-1; i++) {
            if (!isStringFeasible(i, s.length(), k)) {
                continue;
            }
            if (isStringEmpty(smallest) || !isGreaterGreater(s.substring(i,i+k),smallest)) {
                smallest = s.substring(i,i+k);
            }
            if (isStringEmpty(largest) || !isGreaterGreater(largest, s.substring(i,i+k))) {
                largest = s.substring(i,i+k);
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}