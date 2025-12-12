import java.util.*;

public class SolutionWithoutBitSetClass {
    public static int getIntFromStr(String str) {
        return Integer.parseInt(str, 10);
    }
    
    public static String getOppNumAsStr(String str) {
        return str.equals("0") ? "1" : "0";
    }
    
    public static int countOnes(String[] str) {
        int counter = 0;
        for (int i = 0; i <= str.length - 1; i++) {
            if (str[i].equals("1")) {
                counter++;
            }
        }
        return counter;
    }
    
    public static String[] flipOrSet (String[] toChange, String params, String flipOrSet) {
        int idx = getIntFromStr(params);
        toChange[idx] = flipOrSet.equals("f") ? getOppNumAsStr(toChange[idx]) : "1"; 
        return toChange;
    }
    
public static String[] firstAndSecondSet (String[] firstString, String[] secondString) {
        for (int i = 0; i <= firstString.length - 1; i++) {
            if (secondString[i].equals("0")) {
                firstString[i] = "0";
            }
        }
        return firstString;
    }
    
public static String[] firstXorSecondSet (String[] firstString, String[] secondString) {
        // first should be the left-hand operand
        for (int i = 0; i <= firstString.length - 1; i++) {
            if (secondString[i].equals(getOppNumAsStr(firstString[i]))) {
                firstString[i] = "1";
            } else if (firstString[i].equals(secondString[i])) {
                firstString[i] = "0";
            }
        }
        return firstString;
}

public static String[] firstOrSecondSet (String[] firstString, String[] secondString) {
    // first should be the left-hand operand
    for (int i = 0; i <= firstString.length - 1; i++) {
        if (secondString[i].equals("1")) {
            firstString[i] = "1";
        }
    }
    return firstString;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthBitSets = getIntFromStr(scanner.nextLine().split(" ")[0]);
        String[] b1 = new String[lengthBitSets];
        String[] b2 = new String[lengthBitSets];
        Arrays.fill(b1, "0");
        Arrays.fill(b2, "0");
        String[] newValue = {};
        
        int highestChange = 0;
        while (scanner.hasNext()) {

            String[] line = scanner.nextLine().split(" ");
            boolean useFirstArr = line[1].equals("1");
            highestChange = Math.max(highestChange, Integer.parseInt(line[2]));
            switch(line[0]) {
            case "FLIP":
            case "SET":
                newValue = flipOrSet(
                    useFirstArr ? b1 : b2, 
                    line[2],
                    line[0].equals("FLIP") ? "f" : "s");
                break;
            case "OR":
                newValue = firstOrSecondSet(
                    useFirstArr ? b1 : b2,
                    !useFirstArr ? b1 : b2
                );
                break;
            case "XOR":
                newValue = firstXorSecondSet(
                    useFirstArr ? b1 : b2,
                    !useFirstArr ? b1 : b2
                );
                break;
            case "AND":
                newValue = firstAndSecondSet(
                    useFirstArr ? b1 : b2,
                    !useFirstArr ? b1 : b2                
                    );
                break;
            default:
            break;
            }
            if (useFirstArr) {
                b1 = newValue;
                System.out.println(countOnes(newValue) + " " + countOnes(b2));
            } else {
                b2 = newValue;
                System.out.println(countOnes(b1) + " " + countOnes(newValue));
            };
        }
    }
}