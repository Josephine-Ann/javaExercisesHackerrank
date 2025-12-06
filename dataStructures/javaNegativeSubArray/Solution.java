import java.io.*;
import java.util.*;
import java.lang.Integer;

public class Solution {
    
    public static List<Integer> nums = new ArrayList<>();
    
    public static Integer sumArr(List<Integer> arr) {
        return arr
        .stream()
        .reduce(0, Integer::sum);
    }
    
    public static int countNegativeNumbers(List<Integer> arr) {
        long count = arr.stream()
                           .filter(i -> i < 0)
                           .count();
        return (int)count;
    }
    
    public static boolean checkValidityOfPair(int i, int j) {
        return ((i <= nums.size() - 1) && i >= 0) && ((j <= nums.size() - 1) && j >= 0) && i < j + 1; 
    } 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer quantity = scan.nextInt();
        Integer res = 0;
        for (int i = 0; i <= quantity - 1; i++) {
            Integer currentInt = scan.nextInt();
            nums.add(currentInt);
        }
        for (int i = 0; i <= nums.size() - 1; i++) {
            for (int j = nums.size() - 1; j >= 0; j--) {
                boolean shouldProceed = checkValidityOfPair(i,j);
                if (shouldProceed) {
                    List<Integer> sliced = nums.subList(i, j+1);
                    int total = sumArr(sliced);
                    if (total < 0) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
        scan.close();
    }
}
