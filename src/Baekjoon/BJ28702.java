package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class BJ28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int d = 0;
        Set<String> mySet = new TreeSet<>();
        for (int i = 0; i < 100000000; i++) {
            mySet.add(String.valueOf(i));
        }
        if (mySet.contains(a)){
            d = Integer.parseInt(a);
        } else if (mySet.contains(b)) {
            d = Integer.parseInt(b);
        } else if (mySet.contains(c)) {
            d = Integer.parseInt(c);
        }
        if (d % 3 == 0 && d % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (d % 3 == 0 && d % 5 != 0) {
            System.out.println("Fizz");
        } else if (d % 3 != 0 && d % 5 == 0) {
            System.out.println("Buzz");
        }else {
            System.out.println(d);
        }
    }
}
