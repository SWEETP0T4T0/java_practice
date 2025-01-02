package Progrmmers;

import java.util.Arrays;

public class PG120847 {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        System.out.println(answer);
    }
}
