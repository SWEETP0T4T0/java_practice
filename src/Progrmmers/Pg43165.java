package Progrmmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pg43165 {
    public static void main(String[] args) {

        int[] numbers = {1,1,1,1,1};
        int target = 3;
        int answer = 0;
        int n = numbers.length;


        List<List<Integer>> binaryArrays = generate(n);

        for (int i = 0; i < binaryArrays.size(); i++) {
            int a = 0;
            for (int j = 0; j < n; j++) {
                if (binaryArrays.get(i).get(j) == 0) {
                    a = a - numbers[j];
                }else {
                    a = a + numbers[j];
                }
            }
            if (a == target) {
                answer ++;
            }
        }
        System.out.println(answer);
    }


    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        generateHelper(n, new ArrayList<>(), result);
        return result;
    }

    private static void generateHelper(int n, List<Integer> current, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(current)); // 현재 조합 저장
            return;
        }

        // 0을 추가한 경우
        current.add(0);
        generateHelper(n - 1, current, result);
        current.remove(current.size() - 1); // 마지막 추가한 요소 제거

        // 1을 추가한 경우
        current.add(1);
        generateHelper(n - 1, current, result);
        current.remove(current.size() - 1); // 마지막 추가한 요소 제거
    }
}