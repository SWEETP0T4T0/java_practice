package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1253 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] stArr = br.readLine().split(" ");
        long[] arr = new long[N];

        for (int i = 0; i < stArr.length; i++) {
            arr[i] = Integer.parseInt(stArr[i]);
        }
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            while (left < right) {
            }
        }

    }
}


