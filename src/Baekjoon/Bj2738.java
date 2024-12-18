package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2738 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (br.readLine().split(" "));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i =0; i < N; i++) {
            String[] input1 = (br.readLine().split(" "));
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(input1[j]);
            }
        }
        for (int i =0; i< N; i++){
            String[] input1 = (br.readLine().split(" "));
            for (int t = 0; t < M; t++) {
                arr2[i][t] = Integer.parseInt(input1[t]);
            }
        }
        for (int i =0; i < N; i++) {
            for (int t = 0; t < M; t++) {
                sb.append(arr[i][t]+arr2[i][t]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
