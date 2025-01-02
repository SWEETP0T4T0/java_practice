package Progrmmers;

import java.util.*;

public class PG1844 {
    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1},
                       {1, 0, 1, 0, 1},
                       {1, 0, 1, 1, 1},
                       {1, 1, 1, 0, 1},
                       {0, 0, 0, 0, 1}};
        int n = maps.length * maps[0].length;
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                if (maps[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }
        visited[0][0] = true;

        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0});
        int count = 0;
        while (!que.isEmpty()) {
            int[] temp = que.poll();
            int a = temp[0];
            int b = temp[1];
            for (int[] map : maps) {
                if (a + 1 < maps[0].length && !visited[a + 1][b]) {
                    a++;
                    visited[a][b] = true;
                    count++;
                    que.add(new int[] {a,b});
                } else if (a - 1 >= 0 && !visited[a - 1][b]) {
                    a--;
                    visited[a][b] = true;
                    count++;
                    que.add(new int[] {a,b});
                } else if (b + 1 < maps[0].length && !visited[a][b + 1]) {
                    b++;
                    visited[a][b] = true;
                    count++;
                    que.add(new int[] {a,b});
                } else if (b - 1 >= 0 && !visited[a][b - 1]) {
                    b--;
                    visited[a][b] = true;
                    count++;
                    que.add(new int[] {a,b});
                } else {
                    break;
                }
                if (a == maps.length - 1 && b == maps.length - 1) {
                    break;
                }
                System.out.println(a);
                System.out.println(b);
                System.out.println(count);
                System.out.println();
            }
        }
        System.out.println(count);
    }
}










//        int count = 0;
//        int a = 0;
//        int b = 0;
//
//        while (true) {
//            if (a+1<maps[0].length && !visited[a+1][b]){
//                a++;
//                visited[a][b]=true;
//                count++;
//            }else if (a-1>=0 && !visited[a-1][b]){
//                a--;
//                visited[a][b]=true;
//                count++;
//            }else if (b+1<maps[0].length && !visited[a][b+1]){
//                b++;
//                visited[a][b]=true;
//                count++;
//            }else if (b-1>=0 && !visited[a][b-1]){
//                b--;
//                visited[a][b]=true;
//                count++;
//            } else {
//                break;
//            }
//            if (a == maps.length-1 && b == maps.length-1) {
//                break;
//            }
//        }
//        System.out.println(count);


