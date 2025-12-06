import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static List<List<Integer>> arr = new ArrayList<>();

    public static boolean areCoordinatesValid(int y, int x) {
        if (y <= arr.size() - 1) {
            return x <= arr.get(y).size() - 1;
        }
        return false;
    }

    public static int getSumOfHourglass(int[] i) {
        int ae_x = i[0];
        int bdf_x = ae_x + 1;
        int cg_x = ae_x + 2;
        int abc_y = i[1];
        int dy = abc_y + 1;
        int efg_y = dy + 1;

        boolean validity = areCoordinatesValid(abc_y, ae_x) &&
                areCoordinatesValid(abc_y, bdf_x) &&
                areCoordinatesValid(abc_y, cg_x) &&
                areCoordinatesValid(dy, bdf_x) &&
                areCoordinatesValid(efg_y, ae_x) &&
                areCoordinatesValid(efg_y, bdf_x) &&
                areCoordinatesValid(efg_y, cg_x);

        if (validity) {
            return arr.get(abc_y).get(ae_x)
                    + arr.get(abc_y).get(bdf_x)
                    + arr.get(abc_y).get(cg_x)
                    + arr.get(dy).get(bdf_x)
                    + arr.get(efg_y).get(ae_x)
                    + arr.get(efg_y).get(bdf_x)
                    + arr.get(efg_y).get(cg_x);
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        IntStream.range(0, 6).forEach(i -> {
            arr.add(
                    Stream.of(scanner.nextLine().trim().split("\\s+"))
                            .map(Integer::parseInt)
                            .collect(toList()));
        });

        int largestHourglass = 0;
        int[] u = new int[2];
        u[0] = 0;
        u[1] = 0;
        largestHourglass = getSumOfHourglass(u);
        for (int i = 0; i <= arr.size() - 1; i++) {
            for (int j = 0; j <= arr.size() - 1; j++) {
                int[] x = new int[2];
                x[0] = i;
                x[1] = j;
                largestHourglass = Math.max(largestHourglass, getSumOfHourglass(x));
            }
        }

        System.out.println(largestHourglass);

    }
}
