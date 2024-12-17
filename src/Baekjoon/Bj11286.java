package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

public class Bj11286 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N-1; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                if (arr.isEmpty()) {
                    System.out.println("0");
                }else {
                    System.out.println(arr.get(0));
                    arr.remove(0);
                }
            }else {
                arr.add(a);
                arr.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if (Math.abs(o1) == Math.abs(o2)) {
                            return o1-o2;
                        } else return Math.abs(o1) - Math.abs(o2);
                    }
                });
            }

        }
    }
}

class math{
    void abs(List<Integer> list) {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
    }
}
