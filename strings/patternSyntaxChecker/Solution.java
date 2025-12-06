import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkForPatternException(String regex) {
        try {
            java.util.regex.Pattern.compile(regex);
            return true;
        } catch(java.util.regex.PatternSyntaxException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i = 0; i <= testCases - 1; i++) {
            String pattern = in.nextLine();
            System.out.println(checkForPatternException(pattern) ? "Valid":"Invalid");
        }
    }
}
