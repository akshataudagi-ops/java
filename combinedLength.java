import java.util.*;

public class combinedLength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of strings: ");
        int size = sc.nextInt();

        String[] strs = new String[size];

        int totalLength = 0;

        for(int i = 0; i<size; i++) {
            strs[i] = sc.next();
            totalLength = totalLength + strs[i].length();
        }

        System.out.println("Combined length of all the strings is " + totalLength);

        }
}