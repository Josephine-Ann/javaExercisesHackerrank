import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer quantityOfList = Integer.valueOf(scan.nextLine());
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Integer quantityOfQueries = Integer.valueOf(scan.nextLine());
        for (int i = 0; i <= quantityOfQueries - 1; i++) {
            Boolean toInsert = scan.nextLine().contentEquals("Insert");
            List<Integer> query = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int relevantIndex = query.get(0);
            if (toInsert) {
                Integer forReplacing = query.get(1);
                list.add(relevantIndex, forReplacing);
            } else {
                list.remove(relevantIndex);
            }
        }
       System.out.println(String.join(" ", list.stream().map(Object::toString)
                                        .collect(Collectors.toList())));
    }
}
