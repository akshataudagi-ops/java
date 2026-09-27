import java.util.*;
public class sumOfNaturalNum {
    public static void printSum(int i, int n, int sum) {
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static void main(String args[]) {
        printSum(1, 4, 0);
    }
}   
