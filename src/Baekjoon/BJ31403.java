package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ31403 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String  B = br.readLine();
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(A)+Integer.parseInt(B)-C;
        int E = Integer.parseInt(A+B)-C;

        System.out.println(D);
        System.out.println(E);
    }
}
