package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BJ2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = a*b*c;
        String e = String.valueOf(d);

        Map<String,Integer> map1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(String.valueOf(i), 0);
        }
        for (int i = 0; i < e.length(); i++) {
            map1.put(String.valueOf(e.charAt(i)),(map1.getOrDefault(String.valueOf(e.charAt(i)),0))+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : map1.values()) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
