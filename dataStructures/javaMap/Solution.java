import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<String, String> phonebook  = new HashMap<>();   
        Scanner scanner = new Scanner(System.in);
        int quantityContacts = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i <= quantityContacts - 1; i++) {
            phonebook.put(scanner.nextLine(), scanner.nextLine());
        }
        while (scanner.hasNext()) {
            String key = scanner.nextLine();
            if (phonebook.containsKey(key)) {
                System.out.println(key + "=" + phonebook.get(key));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
