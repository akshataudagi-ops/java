import java.util.*;

public class bubbleSort {
    public static void printArray(int a[]) {
        
        for(int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String args[]) {
        int a[] = {12,4,16,5,1};

        for(int i = 0; i<a.length-1; i++) {
            for(int j = 0; j<a.length-i-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            } 
        }
         printArray(a);
    }
   
}