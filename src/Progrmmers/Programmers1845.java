package Progrmmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers1845 {
    public static void main(String[] args) {


        int[] num = {3, 3, 3, 2, 2, 4};
        Set<Integer> pick = new HashSet<>();

        for (int i = 0; i<num.length; i++) {
            pick.add(num[i]);
        }

        System.out.println(pick);
    }
}

