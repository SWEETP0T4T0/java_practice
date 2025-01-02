package Progrmmers;

import java.util.*;

public class PG49189 {
    static List<List<Integer>> adjList;
    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
        int answer = 0;
        adjList = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
        for (List<Integer> list : adjList) {
            list.sort(Comparator.naturalOrder());
        }

        boolean[] visited = new boolean[n+1];
        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(1);
        int[] arr = new int[n+1];
        visited[1] = true;

        while (!myQue.isEmpty()) {
            int temp = myQue.poll();
            for (int target : adjList.get(temp)) {
                if (!visited[target]) {
                    arr[target] = arr[temp]+1;
                    myQue.add(target);
                    visited[target] = true;
                }
            }
        }
        int a  = Arrays.stream(arr).max().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                answer++;
            }
        }
        System.out.println(answer);
        }
    }

