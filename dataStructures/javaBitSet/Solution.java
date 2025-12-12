import java.util.*;

public class Solution {
    public static int getIntFromStr(String str) {
        return Integer.parseInt(str, 10);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthBitSets = getIntFromStr(scanner.nextLine().split(" ")[0]);

        BitSet B1 = new BitSet(lengthBitSets);
        BitSet B2 = new BitSet(lengthBitSets);
        
        
        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            boolean useFirstArr = line[1].equals("1");
            switch(line[0]) {
            case "FLIP":
            if (useFirstArr) {
                B1.flip(getIntFromStr(line[2]));
            } else {
                B2.flip(getIntFromStr(line[2]));
            }
            break;
            case "SET":
            if (useFirstArr) {
                B1.set(getIntFromStr(line[2]));
            } else {
                B2.set(getIntFromStr(line[2]));
            }
            break;
            case "OR":
            if (useFirstArr) {
                B1.or(B2);
            } else {
                B2.or(B1);
            }

            break;
            case "XOR":
            if (useFirstArr) {
                B1.xor(B2);
            } else {
                B2.xor(B1);
            }

            break;
            case "AND":
            if (useFirstArr) {
                B1.and(B2);
            } else {
                B2.and(B1);
            }
            break;
            default:
            break;
            }
        System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scanner.close();
    }
}
