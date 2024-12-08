package Progrmmers;

import java.util.Arrays;

public class Programmer87389 {
    public static void main(String[] args) {
        int n = 12;
        int x = 0;
        int arr[] = new int[n - 1];
        for (int j = 1; j < n; j++) {
            arr[j - 1] = j;
        }
        for (int j = 0; j < n-1; j++) {
            if (n % arr[j] == 1) {
                if (x==0){
                    x = arr[j];}

                    }
                }System.out.println(x);

            }

        }





