package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        String[] arr1 = br.readLine().split(" ");
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(arr1[i]);
        }
        int m = Integer.parseInt(br.readLine());
        int[] brr = new int[m];
        String[] brr1 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            brr[i] = Integer.parseInt(brr1[i]);
        }
        Arrays.sort(arr);

        for (int i = 0; i < brr.length; i++) {
            if (Arrays.binarySearch(arr, brr[i]) < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        }
    }
