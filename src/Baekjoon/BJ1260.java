package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);

        int[][] arr1 = new int[m][2];
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            arr1[i][0] = Integer.parseInt(input[0]);
            arr1[i][1] = Integer.parseInt(input[1]);
        }

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] b : arr1) {
                adjList.get(b[0]).add(b[1]);
                adjList.get(b[1]).add(b[0]);
        }
        boolean[] visited1 = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        dfs(adjList,v,visited1);
        System.out.println();

//        bfs
        StringBuilder sb2 = new StringBuilder();
        Queue<Integer> myQUe = new LinkedList<>();
        myQUe.add(v);
        boolean[] visited2 = new boolean[n+1];
        visited2[v] = true;
        while (!myQUe.isEmpty()) {
            int temp = myQUe.poll();
            sb2.append(temp).append(" ");
            for (int target : adjList.get(temp)) {
                if (!visited2[target]) {
                    myQUe.add(target);
                    visited2[target] = true;
                }
            }
        }
        System.out.println(sb2);
    }

    static void dfs(List<List<Integer>> adjList, int start, boolean[] visited) {
        System.out.print(start+" ");
        visited[start] = true;
        for (int a : adjList.get(start)) {
            if (!visited[a]) {
                dfs(adjList,a,visited);
            }
        }

    }
}
