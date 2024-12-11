package Progrmmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers1845 {
    public static void main(String[] args) {


        int[] nums = {3, 3, 3, 2, 2, 4};
        Set<Integer> pick = new HashSet<>();
        int answer = 0;

        for (int i = 0; i<nums.length; i++) {
            pick.add(nums[i]);
        }
        int a = pick.size();
        int b = nums.length/2;

        if (a > b) {
            answer = b;
        }else answer = a;

        System.out.println(answer);
    }
}

