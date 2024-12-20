package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = N - 1; i == 0; i--) {
            for (int j = 0; j <= i; j++) {
                arr[i] = " ";
            }
            for (int p = N-1; p <=i; p++) {
                arr[p] = "★";
            }
            System.out.println(Arrays.toString(arr));
            for (String s : arr) {
                sb.append(s);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
