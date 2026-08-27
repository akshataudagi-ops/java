import java.util.*;

public class Power {
    public static int calPower(int x, int n) {
        int result = 1;
        for (int i=0; i<n; i++) {
            result = result * x;
        }
        return result;
    }
    public static void main(String args[]) {
        System.out.print("x ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("n ");
        int n = sc.nextInt();
        System.out.println(calPower(x,n));
    } 
}