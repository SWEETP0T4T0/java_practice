package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int b = 0;
        for (int i = 0; i < n; i++) {
            b += Integer.parseInt(a.substring(i, i + 1));
        }
        System.out.println(b);
    }
}
