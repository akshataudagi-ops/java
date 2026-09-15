import java.util.*;

public class getValueinbit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal num : ");
        int n = sc.nextInt();
        System.out.println("Enter bit postion  : ");

        int position = sc.nextInt();
        int bitmask = 1<<position; 

        if((bitmask & n)==0) {
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }

        
    }
}