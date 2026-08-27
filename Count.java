//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.*;

public class Count {
    public static int Count(int n) {
        int pos = 0, neg = 0, zero = 0;
        if(n<0) {
            neg++;
            return neg;
        }
        else if(n>0) {
            pos++;
            return pos;
        }
        else{
            zero++;
            return zero;
        }
        
        
    }
    public static void Print(int pos, int neg, int zero) {
        System.out.println("pos = " + pos);
        System.out.println("neg = " + neg);
        System.out.println("zero = " + zero);
    }
    public static void main(String args[]) {
        while(n!=" "){
        Scanner sc = new Scanner();
        int n = sc.nextInt();
        Count(n);
        }
        Print(pos,neg,zero);
    }
}