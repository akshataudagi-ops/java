import java.util.*;

public class selectionSort {
    public static void printArray(int a[]) {  
        for(int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]) {
        int a[] = {12,4,16,5,1};

        for(int i = 0; i<a.length-1; i++) {
            int smallest = i;
            for(int j = i+1; j<a.length; j++) {
                if(a[smallest] > a[j]) {
                   smallest = j;
                }
                int temp;
                temp = a[smallest];
                a[smallest] = a[i];
                a[i] = temp;   
            } 
        }
         printArray(a);
    }
   
}