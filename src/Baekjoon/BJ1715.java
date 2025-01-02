package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BJ1715 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQ = new PriorityQueue<>();


        for (int i = 0; i < N; i++) {
            pQ.add(Integer.parseInt(br.readLine()));
        }

        int total = 0;
        while (pQ.size() > 1) {
            int a = pQ.poll();
            int b = pQ.poll();
            total += a+b;
            pQ.add(a + b);
        }
        System.out.println(total);
    }
}
