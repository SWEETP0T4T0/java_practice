package Progrmmers;

import java.util.Arrays;

public class PG120821 {
    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5};
        int[] newList = new int[num_list.length];

        int left = 0;
        int right = num_list.length-1;
        while (left<newList.length){
            newList[left]=num_list[right];
            left++;
            right--;
        }
        System.out.println(Arrays.toString(newList));
    }
}