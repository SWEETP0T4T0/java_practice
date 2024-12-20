package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            List<String> answer = new ArrayList<>();
            for (int j = 1; j < b+1; j++) {
                for (int p = 1; p < a + 1; p++) {
                    if (j < 10) {
                        answer.add(p +"0"+ j);
                    }else {
                        answer.add(String.valueOf(p) + j);
                    }
                }
            }
            sb.append(answer.get(c-1)).append("\n");
        }
        System.out.println(sb);
    }
}
