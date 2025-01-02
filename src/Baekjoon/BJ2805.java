package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.*;

public class BJ2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] arr1 = br.readLine().split(" ");
        int N = Integer.parseInt(arr1[0]);
        int M = Integer.parseInt(arr1[1]);
        String[] arr2 = br.readLine().split(" ");
        int[] arr = new int[N];
        int answer = 0;

        for (int i = 0; i < arr2.length; i++) {
            arr[i] = Integer.parseInt(arr2[i]);
        }
        Arrays.sort(arr);

        int left = 1;
        int right = arr[arr.length - 1];

        while (true) {
            int total = 0;
            int mid = (left + right) / 2;
            for (int i = 0; i < arr.length; i++) {
                if (mid < arr[i]) {
                    total += arr[i] - mid;
                }
            }
            if (total > M) {
                left = mid + 1;
                answer = mid;
            } else if (total <= M) {
                right = mid - 1;
            }
        }
    }
}

