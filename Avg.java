import java.util.*;

public class Avg {
    public static void printAvg(int a, int b, int c) {
        double Avg = (a + b + c)/3.0;
        System.out.println("Average is " + Avg);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printAvg(a, b, c);
    }
}
