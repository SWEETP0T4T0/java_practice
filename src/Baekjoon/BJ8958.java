package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BJ8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int count = 0;
            String a = br.readLine();
            Map<String, Integer> answer = new HashMap<>();
            for (int j = 0; j < a.length(); j++) {
                if (String.valueOf(a.charAt(j)).equals("O")) {
                    answer.put("O", answer.getOrDefault("O", 0) + 1);
                    count += answer.get("O");
                } else if (String.valueOf(a.charAt(j)).equals("X")){
                    answer.put("O", 0);
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}

