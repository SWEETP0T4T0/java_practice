package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2744 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                b += Character.toString(a.charAt(i)).toUpperCase();

            }else {
                b += Character.toString(a.charAt(i)).toLowerCase();
            }
        }
        System.out.println(b);

    }
}
