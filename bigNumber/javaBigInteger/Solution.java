import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static BigInteger getSumOf2Numbers(BigInteger a, BigInteger b) {
        return a.add(b);
    }
    public static BigInteger getMultiplicationOf2Numbers(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        System.out.println(getSumOf2Numbers(a, b));
        System.out.println(getMultiplicationOf2Numbers(a, b));
    }
}
