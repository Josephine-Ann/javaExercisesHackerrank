import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static List<List<Integer>> nums = new ArrayList<>();
    public static List<List<Integer>> queries = new ArrayList<>();
        
    public static boolean areCoordinatesValid(int y, int x) {
            if (y <= nums.size() - 1) {
                return x <= nums.get(y).size() - 1;
            }
            return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int startingPoint = scan.nextInt();
        scan.nextLine();



        for (int i = 0; i<= startingPoint - 1; i++) {
            List<Integer> result = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            result.remove(0);
            nums.add(result);
        }
        scan.nextLine();
        while (scan.hasNext()) {
            List<Integer> result = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            queries.add(result);
        }  
        for (int i = 0; i<= queries.size() - 1; i++) {  
            List<Integer> query = queries.get(i);
            Integer queryY = query.get(0) - 1;
            Integer queryX = query.get(1) - 1;
            boolean queryIsValid = areCoordinatesValid(queryY, queryX);   

            if (queryIsValid) {
                System.out.println(nums.get(queryY).get(queryX));
            } else {
                System.out.println("ERROR!");
            }
        }

    }
}
