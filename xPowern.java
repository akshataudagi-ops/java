import java.util.*;

public class xPowern {
    public static int calPower(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xP_nm1 = calPower(x, n-1);
        int xP_n = x * xP_nm1;
        return xP_n;
    }
    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        int res = calPower(x, n);
        System.out.println(res);

    }
}