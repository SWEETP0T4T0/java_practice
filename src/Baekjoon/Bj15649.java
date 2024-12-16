package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj15649 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (br.readLine().split(" "));
        String result = "";
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            myList.add(i);
        }
        permu(answer, temp, myList, M, new boolean[myList.size()]);
        for (List<Integer> integers : answer) {
            for (Integer integer : integers) {
                sb.append(integer);
                sb.append(" ");
            }
            sb.append("\n");
        }
        result = sb.toString();
        System.out.println(result);
    }

    public static void permu(List<List<Integer>> answer, List<Integer> temp,
                             List<Integer> myList, int count, boolean[] visited) {

        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
