import java.util.*;

public class MaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("enter nums ");

        for(int i = 0; i<size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("nums: ");

        for(int i = 0; i<size; i++) {
            System.out.println(num[i]);
        }

        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<size; i++) {
            if(num[i] < min) {
                min = num[i];
            }
            
            if(num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("min "+ min);
        System.out.println("max "+ max);

    }
}

        
        



        

    


    
