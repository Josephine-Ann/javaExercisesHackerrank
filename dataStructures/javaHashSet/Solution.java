import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> names = new HashSet<String>();
        scanner.nextLine();
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            String[] twoNames = name.split(" ");
            // ****** START: MUST BE ADDED BECAUSE EXPLANATION WRONG ***
            // "That also implies a,b is not same as b,a" -> NO IT DOESN'T. 
            String reversedName = twoNames[1] + " " + twoNames[0];
            if (!names.contains(reversedName)) {
                names.add(name);
            }
            // ****** END: MUST BE ADDED BECAUSE EXPLANATION WRONG ***
            System.out.println(names.size());
        }
    }
}
