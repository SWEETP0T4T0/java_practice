package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1152 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = br.readLine().split(" ");
        if (st1.length == 0) {
            System.out.println("0");
        } else if (st1[0].equals("")) {
            System.out.println(st1.length - 1);
        } else System.out.println(st1.length);
    }
}
