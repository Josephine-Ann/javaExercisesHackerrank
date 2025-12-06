import java.io.*;
import java.util.*;

public class Solution {
    
    public static String sortStringAlphabetically(String str) {
        return str.chars()
                  .sorted()
                  .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                  .toString();
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean isAnagram = true;
        if (a.length() != b.length()) {
            isAnagram = false;
        }
        a = sortStringAlphabetically(a);
        b = sortStringAlphabetically(b);
        for (int i = 0; i <= a.length() - 1 && isAnagram; i++) {
            if (!a.substring(i,i+1).equals(b.substring(i,i+1))) {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}