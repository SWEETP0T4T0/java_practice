package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class BJ3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> answer = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            answer.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(answer.size());
    }
}
