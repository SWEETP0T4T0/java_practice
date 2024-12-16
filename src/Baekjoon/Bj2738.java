package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2738 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (br.readLine().split(" "));
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] arr3 = new int[N][M];

        int i =0;
        for (; i < N; i++) {
            for (int j = 0; j < M; j++) {
                String[] input1 = (br.readLine().split(" "));
                arr[i][j] = Integer.parseInt(input1[j]);
            }
            System.out.println(Arrays.deepToString(arr));
        }
        for (; i< N; i++){
            for (int t = 0; t < M; t++) {
                String[] input1 = (br.readLine().split(" "));
                arr2[i][t] = Integer.parseInt(input1[t]);
            }
            System.out.println(Arrays.deepToString(arr2));
        }
        for (; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println(arr3[0][0]+" "+arr3[0][1]+" "+arr3[0][2]);
        System.out.println(arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]);
        System.out.print(arr3[2][0]+" "+arr3[2][1]+" "+arr3[2][2]);
    }
}
