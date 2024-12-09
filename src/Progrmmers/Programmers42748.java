package Progrmmers;

import java.util.Arrays;
//k번째 수
public class Programmers42748 {
    public static void main(String[] args) {
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[] arr2 = new int[command.length];     //최종 출력 될 배열 길이부터 세팅

        for (int i = 0; i < command.length; i++) {
            int[] arr3 = new int[command[i][1] - command[i][0] + 1];  //arr에서 잘라 낸 수가 들어갈 배열 길이세팅

                for (int j = command[i][0]-1; j < command[i][1]; j++) {
                    arr3[j - command[i][0] +1] = arr[j];
            }
            Arrays.sort(arr3);
                arr2[i]=arr3[command[i][2]-1];

        } System.out.println(Arrays.toString(arr2));

    }
}
