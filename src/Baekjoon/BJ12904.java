package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        뒤에서 뺴기
        String S = br.readLine();
        String T = br.readLine();
        sb.append(T);

        while (true) {
            if (sb.length() == S.length()) {
                break;
            }
            if (sb.charAt(sb.length() - 1) == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.deleteCharAt(sb.length() - 1);
                sb.reverse();
            }
        }
        if (sb.toString().equals(S)) {
            System.out.println(1);
        }else System.out.println(0);

    }
}
