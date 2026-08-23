import java.util.*;

public class Greater  {
    
    public static void printGreater(int a, int b) {
        if(a > b) {
            System.out.println(a + " is greater");
        } else{
            System.out.println(b + " is greater");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printGreater(a, b);
    }
}