import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int toDouble = 1;
        String toReturn = "";
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j <= n - 1; j++) {
                // a is only important for the first one
                // 5 + (1 * 3)
                a += (toDouble * b);
                toDouble *= 2;
                toReturn += a + " ";
            }
            System.out.println(toReturn);
            toReturn = "";
            toDouble = 1;
        }
        in.close();
    }
}
