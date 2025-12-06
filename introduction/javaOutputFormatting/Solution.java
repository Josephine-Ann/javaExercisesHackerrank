import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println(String.format("%1$-" + "15" + "s", s1) + String.format("%1$" + "3" + "s", x).replace(' ', '0'));
            }
            System.out.println("================================");

    }
}

