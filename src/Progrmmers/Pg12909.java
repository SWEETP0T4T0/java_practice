package Progrmmers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pg12909 {
    public static void main(String[] args) {
        String s = "((())"	;
        boolean answer = true;
        Stack<String> st = new Stack<>();
        if (s.substring(0, 1).equals(")")) {
            answer= false;
        } else if (s.substring(s.length()-1,s.length()).equals("(")) {
            answer = false;
        }
        while (answer) {
            int i=0;
            if (String.valueOf(i).equals("(")) {
                st.add(String.valueOf(i));
                i++;
            }else {
                if (st.isEmpty()) {
                    answer=false;
                }else {
                    st.pop();
                    i++;
                }
            }
        }
//        for (char i : s.toCharArray()) {
//            if (String.valueOf(i).equals("(")){
//            st.add(String.valueOf(i));
//            }else {
//                if (st.isEmpty()) {
//                    answer = false;
//                }else{
//                    st.pop();
//                }
//                }
//            }
        System.out.println(answer);
        }
    }

