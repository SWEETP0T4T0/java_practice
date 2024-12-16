package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj6603 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int k = 0;
        while (true) {
            List<List<Integer>> answer = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            sb = new StringBuilder();
            String result = "";
            List<Integer> myList = new ArrayList<>();
            String[] input = (br.readLine().split(" "));
            k = Integer.parseInt(input[0]);
            int[] s = new int[input.length - 1];
            if (k != 0){
                for (int i = 1; i < k+1; i++) {
                    s[i-1] = Integer.parseInt(input[i]);
                }
                for (int i = 0; i < k; i++) {
                    myList.add(s[i]);
                }
                combi(answer, temp, myList, 6, 0);
                for (int i = 0; i < answer.size(); i++) {
                    for (int j = 0; j < answer.get(i).size(); j++) {
                        sb.append(answer.get(i).get(j));
                        sb.append(" ");
                    }sb.append("\n");
                }
                result = sb.toString();
                System.out.println(result);
                sb.append("\n");
            } else {
                break;
            }
        }
    }
    public static void combi(List<List<Integer>> answer, List<Integer> temp,
                             List<Integer> myList, int count, int shot) {
        if (temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = shot; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(answer, temp, myList, count, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
