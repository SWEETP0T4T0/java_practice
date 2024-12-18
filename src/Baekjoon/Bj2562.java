package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj2562 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            arr[i]=(Integer.parseInt(br.readLine()));
        }
        int a = Arrays.stream(arr).max().getAsInt();
        int b = 0;

        for (int i = 0; i < 9; i++) {
            if (arr[i] == a) {
                b =i+1;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
