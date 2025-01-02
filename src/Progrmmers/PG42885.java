package Progrmmers;

import java.util.Arrays;

public class PG42885 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 0;

        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                left++;
            }
            right--;
            answer++;
        }
        System.out.println(answer);
    }
}
