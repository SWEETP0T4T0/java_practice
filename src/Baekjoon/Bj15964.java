package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = (br.readLine().split(" "));
        long a = Integer.parseInt(inputs[0]);
        long b = Integer.parseInt(inputs[1]);

        System.out.println(hyo(a,b));

    }

    static long hyo (long a, long b){
        return ((a+b)*(a-b));
    }
}
