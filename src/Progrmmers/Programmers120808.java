package Progrmmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programmers120808 {
    public static void main(String[] args) {
        int numer1 = 3;
        int denom1 = 4;
        int numer2 = 3;
        int denom2 = 4;
        int[] result1 = new int[2];
        if (denom1 == denom2) {
            double a = (double) (numer1 + numer2) / denom1;
            result1[0] = (int)((numer1 + numer2)/a);
            result1[1] = (int)(denom2/a);

        } else if (denom1 % denom2 == 0) {
            double a = (double) denom1 / denom2;
            result1[0] = numer1 + (int)(numer2 * a);
            result1[1] = denom1;

        } else if (denom2 % denom1 == 0){
            double a = (double) denom2 /denom1;
            result1[0] = (int)(numer1*a) + numer2;
            result1[1] = denom2;
        }else {
            result1[0] = (numer1 * denom2) + (numer2 * denom1);
            result1[1] = denom1 * denom2;
        }
        System.out.println(Arrays.toString(result1));

    }
}
