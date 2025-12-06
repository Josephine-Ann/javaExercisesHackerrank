import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isLetter(String c) {
        return (c.charAt(0) > 96 
        &&  c.charAt(0) < 123) 
        || (c.charAt(0) > 64 &&  c.charAt(0) < 90);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String individualSlices = "";
        List<String> slices = new ArrayList<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (isLetter(s.substring(i,i+1))) {
                individualSlices += s.substring(i,i+1);
            } else {
                if (individualSlices.length() > 0) slices.add(individualSlices);
                individualSlices = "";
            }
        }
        if (individualSlices.length() > 0) slices.add(individualSlices);
        System.out.println(slices.size());
        slices.forEach(sl -> System.out.println(sl));
        scan.close();
    }
}
