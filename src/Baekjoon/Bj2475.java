package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = 0;
        for (int i = 0; i < inputs.length; i++) {
            a += Integer.parseInt(inputs[i])*Integer.parseInt(inputs[i]);
        }
        System.out.println(a%10);
    }
}
