package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bj10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String[] inputs = (br.readLine().split(" "));
        int[] arr = new int[N];
        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        for (int i : arr) {
            if (i == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
