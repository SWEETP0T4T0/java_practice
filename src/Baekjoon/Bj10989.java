package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> arr = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (!arr.containsKey(a)) {
                arr.put(a, 0);
            }else {
                arr.put(a,arr.getOrDefault(arr.get(a),0)+1);
            }
        }



    }
}
