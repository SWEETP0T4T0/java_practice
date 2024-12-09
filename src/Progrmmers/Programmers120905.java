package Progrmmers;

import java.util.ArrayList;
import java.util.List;

public class Programmers120905 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        List<Integer> number = new ArrayList<>();
        for (int i : numlist) {
            if (number.indexOf(i) % n != 0) {
                number.add(i);
            }
        }

        int[] answer = new int[number.size()];
        for (int i = 0; i < answer.length; i++) ;
    }
}

