package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj11286 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> arr = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1)==Math.abs(o2)){
                    return o1-o2;
                }else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                if (arr.isEmpty()) {
                    sb.append(0).append("\n");
                }else {
                    sb.append(arr.poll()).append("\n");
                }
            }else {
                arr.add(a);
            }
        }
        System.out.println(sb.toString());
    }
}
