package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] asc = {"1", "2", "3", "4", "5", "6", "7", "8" };
        String[] dec = {"8", "7", "6", "5", "4", "3", "2", "1" };
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(asc[i])){
                if (answer.equals("descending")){
                    answer = "mixed";
                    break;
                }else {
                    answer = "ascending";
                }
            } else if (arr[i].equals(dec[i])) {
                if (answer.equals("ascending")){
                    answer = "mixed";
                    break;
                }else {
                    answer = "descending";
                }
            } else {
                answer = "mixed";
                break;
            }
        }
        sb.append(answer);
        System.out.println(sb);

    }
}
