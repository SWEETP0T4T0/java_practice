package Progrmmers;

import java.util.Arrays;

//두 개 뽑아서 더하기
public class Programmers68644 {
    public static void main(String[] args) {
        int[] numbers = {2,5,7,9,12};
        int count = 0;
        int[] arr1 = new int[numbers.length*numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arr1[count] = numbers[i] + numbers[j];
                count++;
            }
        }

        int[] arr2 = Arrays.copyOf(arr1, count);
        Arrays.sort(arr2);
        int[] arr3 = new int[count];
        int count2 = 0;
        for (int i = 0; i<arr2.length; i++) {
            if (i==arr2.length-1 || arr2[i] != arr2[i+1]) {
                arr3[count2] = arr2[i];
                count2++;
            }
        }
        int[] arr4 = Arrays.copyOf(arr3, count2);
        System.out.println(Arrays.toString(arr4));











    }
}
