package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2884 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        if (m-45 < 0) {
            if (h-1>0) {
                sb.append(h - 1).append(" ").append(60 + (m - 45));
            }
            else if (h-1==0) {
                sb.append(0).append(" ").append(60 + (m - 45));
            }
            else {
                sb.append(24 + (h - 1)).append(" ").append(60 + (m - 45));
            }
        }else {
            sb.append(h).append(" ").append(m - 45);
        }
        System.out.println(sb);

    }
}
