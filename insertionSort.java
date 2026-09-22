import java.util.*;

public class insertionSort {
    public static void printArray(int a[]) {  
        for(int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]) {
        int a[] = {12,4,16,5,1};
        for(int i = 1; i<a.length; i++){
            int current = a[i];
            int j = i-1;
            while(j>=0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
         printArray(a);
    }
}