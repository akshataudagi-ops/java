import java.util.*;

public class clearBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal num : ");
        int n = sc.nextInt();
        System.out.println("Enter bit postion  : ");

        int position = sc.nextInt();
        int bitmask = 1<<position; 
        int notBitmask = ~(bitmask);

        int newNum = notBitmask & n;
        System.out.println(newNum);


       
    }
}
