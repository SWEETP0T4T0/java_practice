package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (a < X) {
                sb.append(a).append(" ");
            }
        }
        System.out.println(sb);



    }
}
