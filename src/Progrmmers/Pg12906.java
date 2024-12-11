package Progrmmers;

import java.util.Arrays;
import java.util.Stack;

public class Pg12906 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        Stack<Integer> st = new Stack<Integer>();
        st.add(arr[0]);
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != st.peek()) {
                st.add(arr[i]);
            }
        }
        int[] answer = new int[st.size()];
        for (int i = answer.length-1; !st.isEmpty(); i--) {
            answer[i] = st.pop();
        }
        System.out.println(Arrays.toString(answer));
    }
}
