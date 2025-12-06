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
import java.time.DayOfWeek;



public class Solution {
        public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day);
        int dayAsInt = (cal.get(Calendar.DAY_OF_WEEK) - 1) != 0 ? cal.get(Calendar.DAY_OF_WEEK) - 1 : 7;

        return DayOfWeek.of(dayAsInt).toString();
        }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] firstMultipleInput = scanner.nextLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        System.out.println(res);

    }
}
