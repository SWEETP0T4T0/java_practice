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
        int[] answer = new int[2];
        result1[0] = (numer1 * denom2) + (numer2 * denom1);
        result1[1] = denom1 * denom2;
        if (result1[0] > result1[1]) {
            for (int i = 1; i < result1[0]; i++) {
                if (result1[0] % i == 0 && result1[1] % i == 0) {
                    answer[0]=result1[0]/i;
                    answer[1]=result1[1]/i;
                }
                }
        } else if (result1[1] > result1[0]) {
            for (int i = 1; i < result1[1]; i++) {
                if (result1[0] % i == 0 && result1[1] % i == 0) {
                    answer[0] = result1[0] / i;
                    answer[1] = result1[1] / i;
                }
            }
        }else {     answer[0] = 1;
                    answer[1] = 1;
                }

        }

    }


