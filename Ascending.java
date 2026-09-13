import java.util.*;

public class Ascending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int num[] = new int[size];

        for(int i=0; i<size; i++) {
            num[i] = sc.nextInt();
        }

        boolean isAscending= true;

        for(int i = 0; i<num.length-1; i++) {
            if(num[i]>num[i+1]) {
                isAscending = false;
                break;
            }  
        }

        if(isAscending) {
            System.out.println("Array is in ascending order");
        }
        else {
            System.out.println("Array is not in ascending order");
        }

    }
}